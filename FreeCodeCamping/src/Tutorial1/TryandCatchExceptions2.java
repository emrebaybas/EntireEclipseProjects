package Tutorial1;

import java.util.Scanner;

public class TryandCatchExceptions2 {

	public static void main(String[] args) {
	
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a number");
		int friends [] = {1,2,3};
		
		try {
			System.out.println(friends[5]);
			double num=keyboardInput.nextDouble();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
