import java.util.NoSuchElementException;

public class SLinkedList<T> {
	
	protected Node<T> head;
	protected Node<T> tail;
	protected long size;
	
	public SLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public long size() {
		return size;
	}
	
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	
	public void clear() {
		size = 0;
		head = null;
		tail = null;
	}
	
	public T getFirst() {
		if(isEmpty()) throw new NoSuchElementException("List is empty");
		return head.getValue();
	}

	
	public T getLast() {
		if(isEmpty()) throw new NoSuchElementException("List is empty");
		return tail.getValue();
	}

	
	public void addFirst(T value) {
		Node<T> first = new Node<T>();
		first.setValue(value);
		first.setNext(head);
		if(head == null) {
			tail = first;
		}
		head = first;
		size++;
	}
	
	
	public void addLast(T value) {
		if(head == null) { // Ainda não possui head
			addFirst(value);
		}else {
			Node<T> last = new Node<T>();
			last.setValue(value);
			tail.setNext(last);
			last.setPrevious(tail);
			tail = last;
			size++;
		}
	}

	
	public T removeFirst() {
		if(isEmpty()) throw new NoSuchElementException("List is empty");
		T value = head.getValue();
		head = head.getNext();
		size--;
		return value;
	}


	public T removeLast() {
		if(isEmpty()) throw new NoSuchElementException("List is empty");
		T value = tail.getValue();
		Node<T> temp = null;
		
		if (tail.getPrevious() != null) {
			temp = tail.getPrevious();
		}

		temp.setNext(null);
		tail.setPrevious(null);
		tail = temp;
		tail.setNext(null);
		size--;
		return value;
	}
	
	
	public boolean contains(T value) {
		Node<T> temp = head;
		while(temp != null) {
		if(temp.getValue().equals(value)) {
			return true;
		}
			temp = temp.getNext();
		}
		return false;
	}
	
	
	public Object[] toArray() {
		Object[] array = new Object[(int) size];
		Node<T> temp = head;
		for(int i = 0; i < size; i++) {
			array[i] = temp.getValue();
			temp = temp.getNext();
		}
		return array;
	}
	
	
	public T get(int index) {
		if(index >= size || index < 0) throw new IndexOutOfBoundsException("index "+index);
		Node<T> temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp.getValue();
	}
	
	
	public T remove(int index) {
		if(index >= size  || index < 0) throw new IndexOutOfBoundsException("index "+index);
		Node<T> temp = head;
		Node<T> before = null;
		for(int i = 0; i < index; i++) {
			before = temp;
			temp = temp.getNext();
		}
		if(before == null) {
			head = temp.getNext();
		}else {
			before.setNext(temp.getNext());
			if(temp == tail) {
				tail = before;
			}
		}
		size--;
		return temp.getValue();
	}
	
	public void add(int index, T value) {
		if(index > size || index < 0) throw new IndexOutOfBoundsException("index "+index);
		Node<T> temp = head;
		Node<T> before = null;
		for(int i = 0; i < index; i++) {
			before = temp;
			temp = temp.getNext();
		}
		Node<T> newNode = new Node<T>();
		newNode.setValue(value);
		newNode.setNext(temp);
		newNode.setPrevious(before);
		if(before == null) {
			head = newNode;
		}else {	
			before.setNext(newNode);
			if(temp == tail) {
				tail = newNode;
			}
		}
		size++;
	}
	
	public void set(int index, T value) {
		if(index >= size || index < 0) throw new IndexOutOfBoundsException("index "+index);
		Node<T> temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		temp.setValue(value);
	}
}