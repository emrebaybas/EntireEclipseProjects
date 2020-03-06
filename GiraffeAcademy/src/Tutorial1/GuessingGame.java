package Tutorial1;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {


		Scanner keyboardInput= new Scanner (System.in);
		
		String secretWord="Selam";
		String guess="";
		int guessCount=0;
	
		
		while (!guess.equals(secretWord)&&guessCount<3) {
			System.out.print("Enter a guess: ");
			guess= keyboardInput.nextLine();
			guessCount++;
		
		}if (guessCount>= 3 && !guess.equals(secretWord)) {
			System.out.print("You Lost!");
		}else {
			System.out.print("You Won!");
			
		}
		keyboardInput.close();
	}

}
