package br.univille.estd.stacks;

import java.util.NoSuchElementException;

public class StackMin<E> implements Stack<E> {
	
	private int n;  // size of the stack
    private Node first; // top of stack

    // helper linked list class
    private class Node {
        private E item;
        private Node next;
    }

   /**
     * Inicializa a pilha como null
     * 
     */
    public void Stack() {
        first = null;
        n = 0;
    }

    /**
     * Retorna true se a pilha estiver vazia
     *
     * @return Retorna true se a pilha estiver vazia
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Retorna o tamanho da pilha
     *
     * @return Retorna o tamanho da pilha
     */
    public int size() {
        return n;
    }

    /**
     * Adiciona um item a pilha
     *
     * @param Adiciona um item a pilha
     */
    public void push(E item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * Remove e retorna o item recentemente adicionado na pilha
     *
     * @return o item recentemente adicionado
     * @throws NoSuchElementException se a pilha estivar vazia
     */
    public E pop() throws EmptyStackException  {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        E item = first.item; // salva o item de retorno
        first = first.next; // deleta o primeiro node
        n--;
        return item; // retorna o item salvo
    }


    /**
     * Retorna o item recentemente adicionado
     *
     * @return Retorna o item recentemente adicionado
     * @throws NoSuchElementException se a pilha estiver vazia
     */
    public E top() throws EmptyStackException{
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

}
