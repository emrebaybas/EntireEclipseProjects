package Tutorial1;

import java.util.Scanner;

public class Calculater2Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboardInput= new Scanner(System.in);
		
		System.out.print("Enter a number");
		double num1=keyboardInput.nextDouble();
		
		System.out.print("Enter an operator");
		String op=keyboardInput.next();
		
		System.out.print("Enter a number");
		double num2=keyboardInput.nextDouble();
		
		if(op.contentEquals("+")) {
			System.out.println(num1+num2);
		}else if (op.contentEquals("-")) {
			System.out.println(num1-num2);
		}else if (op.contentEquals("*")) {
			System.out.println(num1 *num2);
		}else if (op.contentEquals("/")) {
			System.out.println(num1/ num2);
		}else {
			System.out.println("Invalid Operator");
		
		
		}
		keyboardInput.close();
	}

}
