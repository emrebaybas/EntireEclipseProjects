package Tutorial1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryandCatch3 {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
		int friends [] = {1,2,3};
		System.out.print("Enter a number");
		
		try {
			System.out.println(friends[5]);
			double num=keyboardInput.nextDouble();
			System.out.println(num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("hey there is only 0,1,2 index numbers available");
		}catch (InputMismatchException e) {
			System.out.println("Hey you entered an invalid Input");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
