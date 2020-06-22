package br.univille.estd.queues.array;

import br.univille.estd.queues.EmptyQueueException;
import br.univille.estd.queues.Queue;

public class ArrayQueue<E> implements Queue<E> {
	/**
	 * É um índice de uma célula de Q que guarda o primeiro elemento da fila, a não ser que a fila esteja vazia.
	 * Quando se remove um elemento da frente da fila, incrementa-se f para indicar a próxima célula.
	 */
	protected int f = 0;
	
	/**
	 * é um índice de uma célula de Q que guarda o primeiro elemento da fila, a não ser que a fila esteja vazia.
	 */
	protected int r = 0;
	public static final int CAPACITY = 1000;
	protected int capacity;
	protected E Q[];
	
	public ArrayQueue() {
		this(CAPACITY);
	}
	
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		Q = (E[])new Object[this.capacity];
	}

	@Override
	public long size() {
		return (capacity-f+r)%capacity;
	}

	@Override
	public boolean isEmpty() {
		return (f == r);
	}

	@Override
	public void enqueue(E e) {
		if (size() == (capacity-1) ) {
			throw new FullQueueException("Error!");
		}else {
			Q[r] = e;
			r = (r+1)%capacity;
		}
	}

	@Override
	public E dequeue() {
		if(isEmpty()) {
			throw new EmptyQueueException("empty");
		}
		E temp = Q[f];
		Q[f] = null;
		f = (f+1)%capacity;
		return temp;
	}

	@Override
	public E front() {
		if(isEmpty()) {
			throw new EmptyQueueException("empty");
		}
		return Q[f];
	}

}
