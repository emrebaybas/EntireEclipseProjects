package Tutorial1;


import java.util.Scanner;
public class ScannerStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner is basically a data type
		
		Scanner scannerName = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		
		String name = scannerName.nextLine();
		System.out.println("Hey " +name+"!");
		
	}

}
