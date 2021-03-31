package stk;

interface Stack{
	
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

public class ArrayStack implements Stack {
	
	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[stackSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("²ËÂü");
		}else {
			itemArray[top++] = item;
		}
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			return 0;
		}
		else {
			return itemArray[top--];
		}
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("no");
		}
		else {
			top--;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			return 'e';
		}else {
		return itemArray[top];
		}
	}
	
	public boolean isFull() {
		return (top == this.stackSize-1);
	}

}
