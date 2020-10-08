package binarytree;

public class BinaryTreeImplmple implements IntegerBinaryTree{

    private LinkedBinaryTree<Integer> tree;
    protected BTPosition<Integer> root; // Referencia para a raiz
    protected int size;

    public BinaryTreeImplmple(){
        root = null;
        size = 0;
        tree = new LinkedBinaryTree<>();
    }

    public void insertElement(BTPosition<Integer>pos,Integer i) throws NullPointerException{
        Integer element = pos.getElement();
        if(pos == null){
          throw new NullPointerException("Posicao invalida");
        }
        if(i < element){
            if(pos.getLeft() != null){
                insertElement(pos.getLeft(),i);
            }
        } else if(i > element){
            if(pos.getRight() != null) insertElement(pos.getRight(),i);
        }else throw new IllegalArgumentException("A arvore ja possui um valor");
    }
    
    /**
	 * metodo de preorder
	 * @param root
	 */
	public void preOrder(BTPosition<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.getElement() + " ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
		
	}
	
	/**
	 * metodo de inorder
	 * @param root
	 */
	public void inOrder(BTPosition<Integer> root) {
		if(root == null) {
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getElement() + " ");
		inOrder(root.getRight());
	}
	
	/**
	 * metodo de postorder
	 * @param root
	 */
	public void postOrder(BTPosition<Integer> root) {
		if(root == null) {
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getElement() + " ");
	}
    
    @Override
    public void add(Integer i) {
        if(isEmpty()){
            size = 1;
            tree.addRoot(i);
        }else{
            size++;
            insertElement(tree.root(),i);
            System.out.println(1);
        }
    }

    @Override
    public boolean contains(Integer i) {
        return containsElement(tree.root(), i);
    }

    private boolean containsElement(BTPosition<Integer> position, Integer i) {
        Integer number = position.getElement();

        if (number.equals(i)) {
            return true;
        }

        if (position.getRight() != null) {
            containsElement(position.getRight(), i);
        }

        if (position.getLeft() != null) {
            containsElement(position.getLeft(), i);
        }

        return false;
    }

    @Override
    public void remove(Integer i) {

    }

    public boolean hasLeft(BTPosition<Integer> v) throws InvalidPositionException{
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
    public boolean hasRight(BTPosition<Integer> v) throws InvalidPositionException{
        if (v == null) {
            throw new InvalidPositionException("posicao vazia");
        }else {
            if(v.getRight() != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return tree.size() == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        tree = new LinkedBinaryTree<>();
    }
}
