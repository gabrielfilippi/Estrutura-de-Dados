

/**
 * Implementacao de uma arvore binaria usando estrutura encadeada
 * @author leandersonandre
 *
 * @param <E>
 */
public class LinkedBinaryTree<E> {
	
	protected BTPosition<E> root; // Referencia para a raiz
	protected int size;           // Numero de nodos
	
	/**
	 * Construtor de uma arvore vazia
	 */
	public LinkedBinaryTree() {
		root = null; // inicia com uma Ã¡rvore vazia
		size = 0;
	}
	
	/**
	 * Retorna o numero de nodos da arvore
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Retorna se um nodo interno
	 */
	public boolean isInternal(BTPosition<E> v) throws InvalidPositionException{
		if ((hasLeft(v) == true) || (hasRight(v) == true)) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * Retorna se um nodo externo
	 */
	public boolean isExternal(BTPosition<E> v) throws InvalidPositionException{
		if (isInternal(v) != true) {
			return true;
		}
		return false;
	}
	
	/**
	 * Retorna se um nodo a raiz
	 */
	public boolean isRoot(BTPosition<E> v) throws InvalidPositionException{
		if(v == null) {
			throw new InvalidPositionException("Erro!");
		}
		//root.equals(v);
		return root.equals(v);
	}
	/**
	 * Retorna se um nodo tem o filho da esquerda
	 */
	public boolean hasLeft(BTPosition<E> v) throws InvalidPositionException{
		if (v == null) {
			throw new InvalidPositionException("Erro!");
		}else {
			if(v.getLeft() != null) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Retorna se um nodo tem o filho da direita
	 */
	public boolean hasRight(BTPosition<E> v) throws InvalidPositionException{
		if (v == null) {
			throw new InvalidPositionException("Erro!");
		}else {
			if(v.getRight() != null) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Retorna a raiz da arvore
	 */
	public BTPosition<E> root() throws EmptyTreeException{
		if(root == null) {
			throw new EmptyTreeException("Arvore vazia");
		}
		return root;
	}
	
	/**
	 * Retorna o filho da esquerda de um nodo
	 * Lanca BoundaryViolationException se nao tiver filho da esquerda
	 */
	public BTPosition<E> left(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if(v == null) {
			throw new InvalidPositionException("valor nulo");
		}
		if(v.getLeft() != null) {
			return v.getLeft();
		}else {
			throw new BoundaryViolationException("Não tem filho da esquerda");
		}
	}
	
	/**
	 * Retorna o filho da direita de um nodo
	 * Lanca BoundaryViolationException se nao tiver filho da direita
	 */
	public BTPosition<E> right(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if(v == null) {
			throw new InvalidPositionException("valor nulo");
		}
		if(v.getRight() != null) {
			return v.getRight();
		}else {
			throw new BoundaryViolationException("Não tem filho da direita");
		}
	}
	
	/**
	 * Retorna o pai de um nodo
	 * Lanca BoundaryViolationException se nao tiver pai
	 */
	public BTPosition<E> parent(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if(v == null) {
			throw new InvalidPositionException("valor nulo");
		}
		if(v.getParent() != null) {
			return v.getParent();
		}else {
			throw new BoundaryViolationException("Não tem pai");
		}
		
	}
	
	/**
	 * Substitui o elemento armazenado no nodo
	 * Retorna o elemento substituido
	 */
	public E replace(BTPosition<E> v, E o) throws InvalidPositionException{
		if(v == null) {
			throw new InvalidPositionException("posição invalida");
		}
		E temp = v.getElement();
		v.setElement(o);
		return temp;
	}
	
	/**
	 * Retorna o irmao de um nodo
	 * Lanca BoundaryViolationException se nao tiver um irmao
	 */
	public BTPosition<E> sibling(BTPosition<E> v) throws InvalidPositionException, BoundaryViolationException{
		if(v == null) {
			throw new InvalidPositionException("elemento invalido");
		}
		if(v.getParent() == null) {
			throw new BoundaryViolationException("Não possui irmão");
		}
		BTPosition<E> temp = v.getParent();
		if(!hasLeft(temp) || !hasRight(temp)) {
			throw new BoundaryViolationException("Não possui filhos");
		}
		if(temp.getRight() == v) {
			return temp.getLeft();
		} 
			return temp.getRight(); 
	}
	
	/**
	 * Insere a raiz em uma arvore vazia
	 */
	public BTPosition<E> addRoot(E e) throws NonEmptyTreeException{
		if(e == null) {
			throw new InvalidPositionException("valor nulo");
		}
		if(root == null) {
			size = 1;
			root = createNode(e, null, null, null);
		}else {
			throw new NonEmptyTreeException("Arvore não está vazia");
		}
		return root;
	}
	
	/**
	 * Insere o filho da esquerda em um nodo
	 */
	public BTPosition<E> insertLeft(BTPosition<E> v, E e) throws InvalidPositionException{
		if(e==null) {
			throw new InvalidPositionException("valor nulo");
		}
		if(hasLeft(v)) {
			throw new InvalidPositionException("Já tem filho");
		}
		BTPosition<E> FE = createNode(e, v, null, null);
		v.setLeft(FE);
		size++;
		return FE;
	}
	
	/**
	 * Insere o filho da direita em um nodo
	 */
	public BTPosition<E> insertRight(BTPosition<E> v, E e) throws InvalidPositionException{
		if(e==null) {
			throw new InvalidPositionException("valor nulo");
		}
		if(hasRight(v)) {
			throw new InvalidPositionException("Já tem filho");
		}
		BTPosition<E> FD = createNode(e, v, null, null);
		v.setRight(FD);
		size++;
		return FD;
	}
	
	/**
	 * Remove um nodo com zero ou um filho
	 * Nao pode remover um nodo com dois filhos. Deve lancar InvalidPositionException
	 */
	public E remove(BTPosition<E> v) throws InvalidPositionException{
		if (v == null) {
			throw new InvalidPositionException("Posicao não pode ser nula");
		}

		if (hasLeft(v) && hasRight(v)) {
			throw new InvalidPositionException("tem 2 filhos");
		}

		BTPosition<E> ww; //o unico filho de v.
		if(v.getLeft() != null) {
			ww = v.getLeft();
		}else if(v.getRight() != null) {
			ww = v.getRight();
		}else {
			ww = null;
		}
		if(v == root) {
			if(ww != null) {
				ww.setParent(null);
			}
			root = ww;
		} else {
			BTPosition<E> uu = v.getParent();
			if(v == uu.getLeft()) {
				uu.setLeft(ww);
			}else {
				uu.setRight(ww);
			}
			if(ww != null) {
				ww.setParent(uu);
			}
		}
		size--;
		return v.getElement();
	}
	

    /**
	 *  Cria um novo nodo para a arvore binaria
	 */
	protected BTPosition<E> createNode(E element, BTPosition<E> parent, BTPosition<E> left, BTPosition<E> right) {
		return new BTPosition<E>(element, parent, left, right);
	}
	
}
