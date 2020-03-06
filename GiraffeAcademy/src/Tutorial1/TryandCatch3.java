package Tutorial1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryandCatch3 {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		
		int friends [] = {10,20,30};
		System.out.print("Enter an index number");
		
		try {
			
			int num=keyboardInput.nextInt();
			System.out.println(friends[num]);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("hey there is only 0,1,2 "
					+ "\nindex numbers available to select");
			
		}catch (InputMismatchException e) {
			System.out.println("Hey you entered an invalid Input");
		}catch (Exception e) {
			System.out.println(e);
		}
		keyboardInput.close();
	}
}
