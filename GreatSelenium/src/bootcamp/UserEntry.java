package bootcamp;

import java.util.Scanner;

public class UserEntry {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("Sum of the two numbers that are entered by you is " +(a+b));
		
		if(a>b) {
			System.out.println("first number entered is greater");
		
		}else if(b>a) {
			System.out.println("second number entered is greater");
			
		}else if(a==b){
			System.out.println("both entries are the same");
		}else {
			System.out.println("expected entry is integer, double check what you entered");
		}
		
		

	}

}
