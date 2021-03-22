package linkedList;

public class SList <E>{

	protected Node head;
	private int size;
	
	public SList() {
		head = null;
		size = 0;
	}
	
	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p) {
		p.setRef(new Node(newItem,p.getRef()));
		size++;
	}
	
}
