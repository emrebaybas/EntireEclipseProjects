package scanners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		
//		Scanner s=new Scanner(System.in);
//		
//		System.out.println("First,Enter your phone number assosiated with the account");
//		System.out.println("please, enter your password");
//		
//		int pNumberInput=s.nextInt();
//		String password=s.next();
//		
//		System.out.println("You entered: " + pNumberInput);
//		System.out.println("Your password is: " + password);
		
	
		LocalTime l= LocalTime.now();
		System.out.println(l);
	
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
	}
}
