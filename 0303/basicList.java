package main;

import java.util.ArrayList;
import java.util.Scanner;

public class basicList {
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int[] c = new int[5];
//		for(int i = 0; i < 5; i++) {
//			int b = sc.nextInt();
//			a.add(b);
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(a.get(i));
//		}
		
		for(int i = 0; i < 5; i++) {
			c[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(c[i]);
			
		}
	
	}

}
