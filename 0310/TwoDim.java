package main;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] sale = new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(sale[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
