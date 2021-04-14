package stk2;

import java.util.Scanner;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = str.length()-1; i >= 0; i-- ) {
			System.out.print(str.charAt(i));
		}
		sc.close();
		
	}

}
