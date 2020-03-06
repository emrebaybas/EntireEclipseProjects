package Tutorial1;

import java.util.Scanner;

public class ScannerWithString_and_Int_Together {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scannerName = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = scannerName.nextLine();  // When using string nextLine
		
		System.out.print("Enter Your Age: ");
		int Age = scannerName.nextInt();  // when using integer nextInt
		System.out.println("Hey " +name+". You are " +Age+" years old now!");
		
		
	}

}
