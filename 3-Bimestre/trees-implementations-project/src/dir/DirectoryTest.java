package dir;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DirectoryTest {

	@Test
	public void shouldShowEmptyDirectorySize() {
		Diretorio dir = new Diretorio("Z:");
		assertEquals("Diretorio com tamanho 1", true, dir.getSize());
	}
	
	@Test
	public void shouldShowNonEmptyDirectorySize() {
		Diretorio dir = new Diretorio("E:");

		Diretorio innerDir = new Diretorio("inner");
		innerDir.addContent(new Arquivo("god.exe", 1024));
		
		dir.addContent(new Arquivo("file1.txt", 256));
		dir.addContent(new Arquivo("ct-mysql.cba", 516));
		dir.addContent(innerDir);	

		assertEquals("Diretorio com tamanho 1798", true, dir.getSize());
	}
	
}
