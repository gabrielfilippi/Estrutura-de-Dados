package dir;

public class Main {

	public static void main(String[] args) {
		Diretorio dir = new Diretorio("C:");
		
		Diretorio downloadsDir = new Diretorio("downloads");
		downloadsDir.addContent(new Arquivo("java.exe", 65536));
		downloadsDir.addContent(new Arquivo("artigo.pdf", 16));
		downloadsDir.addContent(new Arquivo("mysql-driver-jdbc.jar", 256));

		Diretorio eclipseDir = new Diretorio("eclipse");
		Diretorio androidSDKDir = new Diretorio("AndroidSDK");
		
		dir.addContent(downloadsDir);
		dir.addContent(eclipseDir);
		dir.addContent(androidSDKDir);
		dir.addContent(new Arquivo("tcc.doc", 256));
		dir.addContent(new Arquivo("Gimp 2.exe", 256));
		
		dir.printConteudo();

	}
	
}
