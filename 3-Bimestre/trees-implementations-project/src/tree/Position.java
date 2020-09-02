package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Position<E> {
	
	private E element;
	private Position<E> parent;
	private Collection<Position<E>> children = new ArrayList<Position<E>>();
	
	public Position() {
		this(null,null);
	}
	
	public Position(E element) {
		this(element,null);
	}
	
	public Position(E element, Position<E> parent) {
		setElement(element);
		setParent(parent);
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public Position<E> getParent() {
		return parent;
	}

	public void setParent(Position<E> parent) {
		this.parent = parent;
	}
	
	public Position<E> addChild(Position<E> child) {
		return null;
	}
	
	public Position<E> addChild(E element) {
		Position<E> novofilho = new Position<E>(element,this);
		children.add(novofilho);
	
		return novofilho;
	}
	
	public Position<E> removeChild(Position<E> child){		
		this.children.remove(child);
		return child;
	}
	
	public Iterator<Position<E>> getChildren(){
		
		return children.iterator();
		//Position<E> [] arr = Arrays.copyOf(children.toArray(), children.size());
		//return new ArrayIterator<Position<E>>(arr);
	}
	
	public int size() {
		return children.size();
	}
	

}
