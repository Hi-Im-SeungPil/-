package main;

import java.util.Scanner;

public class RecursiveFact {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println(b(sc.nextInt()));
		
	}
	
	public static int b(int num) {
		if(num <= 1) {
			return num;
		}else {
			return b(num - 1) * num;
		}
	}

}
