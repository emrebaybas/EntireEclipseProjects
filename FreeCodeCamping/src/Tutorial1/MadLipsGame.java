package Tutorial1;

import java.util.Scanner;

public class MadLipsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner userInput=new Scanner(System.in);
		
		System.out.print("Enter a girl name: ");
		String nameInput= userInput.nextLine();
		
		System.out.print("Enter an age: ");
		int ageInput= userInput.nextInt();
		
		System.out.print("Select one from shoes,pants,tshirts: ");
		String clothingInput= userInput.next();
	
		System.out.print("Enter a color: ");
		String colorInput= userInput.next();
		
		
		System.out.println(nameInput +" was a pretty girl who is " + ageInput + " years old. She lives in London.\n" 
				+ "One day, She realized that all her " + clothingInput+ " were " + colorInput+"! \nThat day " +nameInput+
				"  decided, she would go out \nand get some new "+clothingInput+" in different colors");
		
		

	}

}
