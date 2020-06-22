package br.univille.estd.queues;

public interface Queue<E> {
	
	long size();
	boolean isEmpty();
	/**
	 * método solicitado
	 * @param parâmetro para solicitar um valor
	 */
	void enqueue(E e);
	/**
	 * Método que permitirá solicitar o ultimo da fila
	 */
	E dequeue();
	E front();

}
