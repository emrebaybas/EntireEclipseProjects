package loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i=1;
		
		while (i<=10) {
			System.out.println(i);
			i++;   // if you dont put this i++ i will never reach to 10 so that loop will keep detecting i as 1 and keep printing 1	
		} 
	}
}
