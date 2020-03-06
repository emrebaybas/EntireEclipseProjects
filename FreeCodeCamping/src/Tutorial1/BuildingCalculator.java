package Tutorial1;

import java.util.Scanner;

public class BuildingCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter in first number: ");
		double numberOne= userInput.nextDouble();
		System.out.print("Enter in second number: ");
		double numberTwo= userInput.nextDouble();
		System.out.println("Your total is : " +(numberOne + numberTwo));

	}

}
