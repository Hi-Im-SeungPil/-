package stk2;

import java.util.Stack;

public class Rev_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack = new Stack<>();
		String str = "String reverse using stack";
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		
	}

}
