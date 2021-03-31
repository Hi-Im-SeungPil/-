package linkedstk;

import java.util.NoSuchElementException;

public class LinkedNode<E>  {
	
	
	private Node<E> top; 
	private int size;
	
	public LinkedNode() {
		
		top = null;
		size = 0;
		
	}
	

	
	public void push(E item) {
		// TODO Auto-generated method stub
		
		top = new Node(item,top);
		size ++;
		
	}
	
	public E pop() {
		if (size == 0) throw new NoSuchElementException();
		E removeItem = top.getItem();
		top = top.getNext();
		size --;
		return removeItem;
	}
	public boolean isEmpty() {
		return (size == 0);
	}
	public int size() {
		return size;
	}
	
	public E getLast() {
		if(size == 0) throw new NoSuchElementException();
		return top.getItem();
	}

	public void print() {
		// TODO Auto-generated method stub
		Node<E> t = top;
		for(int i = 0; i < size; i++) {
			System.out.println(t.getItem());
			t = t.getNext();
		}
		
	}

}
