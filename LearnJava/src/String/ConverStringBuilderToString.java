package String;

public class ConverStringBuilderToString {

	public static void main(String[] args) {
		
		String myString="healty and rich";
	
		StringBuilder s2= new StringBuilder(myString);
		
		String converted=s2.toString();
		
		System.out.println(converted);
	

		
	}

}
