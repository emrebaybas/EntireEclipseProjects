package udemypractices;

public class IncrementPrefixPostfix {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		a = b++; //Postfix
		
		System.out.println("a : " + a + " b : " + b);

		int c=0;
		int d=0;
		c =++d; //Prefix
		
		System.out.println("c : " + c + " d : " + d);

	}
}
