package array;

public class Array3TwoDimensional {

	public static void main(String[] args) {

		// you can also create and array by just entering 
		//row and column numbers without entering the values
		
		// int twoDArray[][]=new int [3][3];
		
		//then insert the values 
		
		// twoDArray[0][0]=1;
		// twoDArray[0][1]=2; etc
		
		
		int twoDArray[][] = {
//					j0				j1				j2				j3
				{ 100,		 200,		 300,		 400 },               //i0
//				j0				j1				j2				j3			
				{ 500, 		600, 		700, 		800 }, 			//i1
				
//				j0				j1				j2				j3			
				{ 900, 		1000,		1100,		1200 } };			//i2

		System.out.println(twoDArray.length);
		System.out.println(twoDArray[0].length);
		System.out.println(twoDArray[1].length);
		System.out.println(twoDArray[2].length);
			
	/*	 
	 * this is first way Nested For Loop
		for (int i=0; i<twoDArray.length ;i++) {
			for(int j=0; j<twoDArray[i].length;j++) {
				System.out.println(twoDArray[i][j]);
			}
			*/
		// This is second way Enhanced Nested For Loops
//			for(int r[]:twoDArray) {
//				for (int x:r) {
//					System.out.println(x);
//				}
				
				
				for (int[] is : twoDArray) {
					for (int x : is) {
						System.out.println(x);
					}
						
					
					}
				}
			}
		
	

