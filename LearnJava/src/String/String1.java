package String;

public class String1 {

	public static void main(String[] args) {

		// String is collection of characters
		String s = "Welcome";
		String s1=" to Java";
		System.out.println(s.length());
		
		System.out.println((s+s1).length());
		
		System.out.println(s.concat(s1)); //to join 2 strings we use .concat()

	}
}
