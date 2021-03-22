package linkedList;

class Node<E> {
	
	private E data;
	private Node<E> ref;
	
	public Node(E data, Node<E> ref) {
		this.data = data;
		this.ref = ref;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getRef() {
		return ref;
	}

	public void setRef(Node<E> ref) {
		this.ref = ref;
	}
	
	

}
