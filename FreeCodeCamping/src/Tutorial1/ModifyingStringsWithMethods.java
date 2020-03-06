package Tutorial1;

public class ModifyingStringsWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//lets use some methods
		//after the variable name if you put . all the available methods will be listed
		
		String MyString = "EmRe BaYbAs";
	
		
		System.out.println(MyString.toUpperCase());
		System.out.println(MyString.toLowerCase());
		System.out.println(MyString.length()); // includes spaces gives the number of characters
		
		System.out.println(MyString.contains("BaY")); // it tells true or false and Case sensitive
		
		System.out.println(MyString.charAt(0));//charAt tells us what is the character in that index number 
		System.out.println(MyString.charAt(1));//but it starts counting from zero 0, so first letter is 0th character
		
		System.out.println(MyString.indexOf("E")); // it will tell index number of the first Capital E
		System.out.println(MyString.lastIndexOf("A")); // if you want to learn the last index number of A
		
		System.out.println(MyString.substring(5)); // starting from the 5th index will print the rest
		System.out.println(MyString.substring(5,8)); // if you want to print BaY starting from 5th until 8th
		System.out.println(MyString.substring(0,4));// if you want to print first name 0,4
		
		System.out.println(MyString.substring(0,MyString.indexOf(" "))); // this means print from 0th index until space
																																// Bc inside " " we left space
	}

}
