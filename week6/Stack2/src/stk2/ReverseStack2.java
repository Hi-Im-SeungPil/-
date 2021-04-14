package stk2;

import java.util.Scanner;

public class ReverseStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		
		System.out.print(sb.reverse());
		
		sc.close();
		
	}

}
