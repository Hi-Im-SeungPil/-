package bracketTest;

public class LinkedStack implements Stack {

	StackNode top;
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == null);
	}

	@Override
	public void push(char item) {
		// TODO Auto-generated method stub
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("empty");
			return 0;
		}else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("empty");
		}else {
			top = top.link;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		return 0;
	}

}
