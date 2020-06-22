package br.univille.estd.queues;

public interface Queue<E> {
	
	long size();
	boolean isEmpty();
	/**
	 * m�todo solicitado
	 * @param par�metro para solicitar um valor
	 */
	void enqueue(E e);
	/**
	 * M�todo que permitir� solicitar o ultimo da fila
	 */
	E dequeue();
	E front();

}
