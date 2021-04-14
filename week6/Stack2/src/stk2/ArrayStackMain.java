package stk2;

public class ArrayStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack<String> a = new ArrayStack<>();
		
		a.push("사과");
		a.push("배");
		a.push("포도");
		a.push("과일");
		System.out.println(a.pop());
		a.print();
		
	}
	
}
