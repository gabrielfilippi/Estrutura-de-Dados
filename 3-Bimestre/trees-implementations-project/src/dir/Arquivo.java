package dir;

public class Arquivo implements MapaInt {

	private final String nomeArquivo;
	private final Integer size;
	
	public Arquivo(String nomeArquivo, Integer size) {
		this.nomeArquivo = nomeArquivo;
		this.size = size;
	}
	
	@Override
	public void printConteudo() {
		System.out.println(this.getName());
	}

	@Override
	public Integer getSize() {
		return size;
	}

	@Override
	public String getName() {
		return nomeArquivo;
	}

}
