package binarytree;

public interface IntegerBinaryTree {
    /**
     * Adiciona um novo inteiro. Lanca excexao DuplicateValueException se o inteiro ja existir na arvore.
     * @param i
     */
    public void add(Integer i);

    /**
     * Retorna true se o inteiro existe na arvore.
     * @param i
     * @return
     */
    public boolean contains(Integer i);

    /**
     * Remove o inteiro da arvore
     * @param i
     */
    public void remove(Integer i);

    /**
     * Retorna true se a arvore estiver vazia
     * @return
     */
    public boolean isEmpty();

    /**
     * Retorna a quantidade de elementos na arvore
     * @return
     */
    public int size();

    /**
     * Remove todos os elementos da arvore.
     */
    public void clear();

    /**
     * transforma a arvore em String utilizando o caminhamento em in-order.
     * @return
     */
    public String toString();
}
