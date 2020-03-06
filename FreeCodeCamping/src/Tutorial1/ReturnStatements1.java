package Tutorial1;

public class ReturnStatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( cube(2) );
		System.out.println( cube(3) );
		System.out.println( cube(5) );

	}
	
	public static int cube(int numberToCube) {
		return (numberToCube*numberToCube*numberToCube);
		// We name the method as cube
		// We defined int variable called numberToCube
		// in the Return statement we defined what we want it to return
		// Inside the main method we called the cube method in the println statement
		
	}
}
