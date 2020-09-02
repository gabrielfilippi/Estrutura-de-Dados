package dir;

import java.util.Iterator;

import tree.Position;
import tree.Tree;

public class Diretorio implements MapaInt {

	private final Integer defaultSize = 1;
	private final String diretorioNome;
	private final Tree<MapaInt> conteudo;

	public Tree<MapaInt> getconteudo() {
		return conteudo;
	}
	
	
	@Override
	public String getName() {
		return diretorioNome;
	}
	
	
	public void addContent(MapaInt conteudo) {
		this.conteudo.addChild(this.conteudo.root(), conteudo);
	}

	public Diretorio(String diretorioNome) {
		this.diretorioNome = diretorioNome;
		this.conteudo = new Tree<>();
		this.conteudo.addRoot(this);
	}

	@Override
	public void printConteudo() {
		System.out.print(this.getName());
		Iterator<Position<MapaInt>> children = conteudo.children(conteudo.root());
		
		while (children.hasNext()) {
			MapaInt conteudo = children.next().getElement();
			conteudo.printConteudo();
		}	
		
	}
	
	@Override
	public Integer getSize() {
		Integer size = defaultSize;
		Iterator<Position<MapaInt>> children = conteudo.children(conteudo.root());
		
		while (children.hasNext()) {
			Position<MapaInt> next = children.next();
			size += next.getElement().getSize();
		}
		
		return size;
	}


}

