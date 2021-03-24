package zzz;

public class DNode<E> {

	private DNode next;
	private E item;
	private DNode previous;
	
	public DNode( E item, DNode previous,DNode next) {
		super();
		this.next = next;
		this.item = item;
		this.previous = previous;
	}
	public DNode getNext() {
		return next;
	}
	public void setNext(DNode next) {
		this.next = next;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E item) {
		this.item = item;
	}
	public DNode getPrevious() {
		return previous;
	}
	public void setPrevious(DNode previous) {
		this.previous = previous;
	}
	
	
	
}
