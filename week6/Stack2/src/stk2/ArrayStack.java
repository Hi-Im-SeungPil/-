package stk2;

import java.util.NoSuchElementException;

public class ArrayStack<E> {
	
	private E s[];
	private int top;;
	public ArrayStack() {
		s = (E[]) new Object[1];
		top = -1;
	}
	
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return (top== -1);
	}
	public E getLast() {
		return s[top];
	}
	public void resize(int newSize) {
		E t[] = (E[]) new Object[newSize];
		for (int i = 0; i < top+1; i++) {
			t[i] = s[i];
		}
		s = (E[]) t;
	}
	
	public E pop() {
		if(isEmpty()) throw new NoSuchElementException();
		E item = s[top];
		if(s.length / 4 == size()) {
			resize(size()/2);
		}
		s[top--] = null;
		return item;
	}
	public void push(E item) {
		if(s.length == size()) {
			resize(size()*2);
		}
		s[++top] = item;
	}
	
	public void print() {
		if(isEmpty()) throw new NoSuchElementException();
		for(int i = 0; i < size(); i++) {
			System.out.println(s[i]);
		}
	}

}
