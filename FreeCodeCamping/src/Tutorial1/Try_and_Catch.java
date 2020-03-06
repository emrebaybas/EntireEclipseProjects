package Tutorial1;

import java.util.Scanner;

public class Try_and_Catch {

	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		try {
			double number = keyboardInput.nextDouble();
			System.out.print(number);

		} catch (Exception e) {
			System.out.println("invalid input");
		}
	}
}
