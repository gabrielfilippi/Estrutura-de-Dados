import java.util.NoSuchElementException;

public class SLinkedList<T> {
	protected Node<T> head;
	protected Node<T> tail;
	protected long size;

	public SLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}


	/*
	 * Retorna o valor conforme a index da lista que foi solicitada
	 * 
	 * @return o valor solicitado
	 */
	public T get(int index) {
		// verificar se existe a index que foi solicitada
		if (isEmpty()) {
			throw new NoSuchElementException("List is empty");
		}
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		// VARIAVEL DO tipo Node recebe o head
		Node<T> current = head;
		int count = 0;
		while (current != null) {
			if (count == index) {
				return current.getValue();
			}
			count++;
			current = current.getNext();
		}
		throw new IndexOutOfBoundsException();
	}
	
	public void set(int index, T value) {
		// verificar se existe a index que foi solicitada
		if (isEmpty()) {
			throw new NoSuchElementException("List is empty");
		}
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		Node<T> current = head;
		int count = 0;
		while (current != null) {
			if (count == index) {
				current.setValue(value);
				break;
			}
			count++;
			current = current.getNext();
		}
	}

	/**
	 * Verifica o tamanho da lista
	 * 
	 * @return o tamanho da lista
	 */
	public long size() {
		return size;
	}

	/**
	 * Verifica se a lista está vazia
	 * 
	 * @return true se estiver vazia. Caso contrário, false
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Remove todos os elementos da lista
	 */
	public void clear() {
		size = 0;
		head = null;
		tail = null;
	}

	/**
	 * complexidade? Retorna o primeiro elemento da lista
	 * 
	 * @return O primeiro elemento da lista
	 * @throws NoSuchElementException Se a lista estiver vazia
	 */
	public T getFirst() {
		if (isEmpty())
			throw new NoSuchElementException("List is empty");
		return head.getValue();
	}

	/**
	 * Retorna o último elemento da lista.
	 * 
	 * @return O último elemento da lista
	 * @throws NoSuchElementException Se a lista estiver vazia
	 */
	public T getLast() {
		if (isEmpty())
			throw new NoSuchElementException("List is empty");
		return tail.getValue();
	}

	public T remove(int index) {
		// verificar se existe a index que foi solicitada
		if (isEmpty()) {
			throw new NoSuchElementException("List is empty");
		}
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			return removeFirst();
		}
		if(index==size()-1) {
			return removeLast();
		}
		Node<T> current = head;
		int count = 0;
		T temp = null;
		Node<T> previous = null;
		while (current != null) {
			if (count == index) {
				temp = current.getValue();
				previous.setNext(current.getNext());
				break;
			}
			count++;
			current = current.getNext();
		}
		return temp;
	}
	
	public void add(int index, T value) {
		// verificar se existe a index que foi solicitada
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			addFirst(value);
		}
		if(index==size()-1) {
			addLast(value);
		}
		Node<T> current = head;
		int count = 0;
		Node<T> previous = null;
		while (current != null) {
			if (count == index) {
				//adicionamos o valor
				Node<T> newNode = new Node<>(value, current);
				previous.setNext(newNode);
				break;
			}
			count++;
			current = current.getNext();
		}
	}

	/**
	 * Adiciona um elemento na cabeça da lista
	 * 
	 * @param value
	 */
	public void addFirst(T value) {
		Node<T> first = new Node<T>();
		first.setValue(value);
		first.setNext(head);
		if (head == null) {
			tail = first;
		}
		head = first;
		size++;
	}

	/**
	 * Adiciona um elemento na cauda da lista
	 * 
	 * @param value
	 */
	public void addLast(T value) {
		if (head == null) { // Ainda não possui head
			addFirst(value);
		} else {
			Node<T> last = new Node<T>();
			last.setValue(value);
			tail.setNext(last);
			tail = last;
			size++;
		}
	}

	/**
	 * complexidade? Remove e retorna o primeiro elemento da lista
	 * 
	 * @return value
	 * @throws NoSuchElementException Se a lista estiver vazia
	 */
	public T removeFirst() {
		if (isEmpty())
			throw new NoSuchElementException("List is empty");
		T value = head.getValue();
		head = head.getNext();
		size--;
		return value;
	}

	/**
	 * Remove e retorna o último elemento da lista
	 * 
	 * @return value
	 * @throws NoSuchElementException Se a lista estiver vazia
	 */
	public T removeLast() {
		if (isEmpty())
			throw new NoSuchElementException("List is empty");
		T value = tail.getValue();
		Node<T> temp = head;
		// Verifica se possui o próximo elemento
		// E verifica se o próximo elemento nao é a cauda
		while (temp.getNext() != null && temp.getNext() != tail) {
			temp = temp.getNext();
		}
		temp.setNext(null);
		// Penultimo elemento, se torna o ultimo elemento
		tail = temp;
		tail.setNext(null); // ultimo elemento aponta para nulo
		size--;
		return value;
	}

	/**
	 * Verifica se a lista contém o valor
	 * 
	 * @param value
	 * @return true se o elemento estiver na lista. caso contrário, false
	 */
	public boolean contains(T value) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getValue().equals(value)) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	/**
	 * Retorna uma lista de objetos com todos os elementos da lista
	 * 
	 * @return
	 */
	public Object[] toArray() {
		Object[] array = new Object[(int) size];
		Node<T> temp = head;
		for (int i = 0; i < size; i++) {
			array[i] = temp.getValue();
			temp = temp.getNext();
		}
		return array;
	}

}
