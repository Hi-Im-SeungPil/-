package stk2;

public class ArrayStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack<String> a = new ArrayStack<>();
		
		a.push("���");
		a.push("��");
		a.push("����");
		a.push("����");
		System.out.println(a.pop());
		a.print();
		
	}
	
}
