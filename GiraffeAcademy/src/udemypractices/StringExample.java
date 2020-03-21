package udemypractices;
public class StringExample {
	
	public static void main(String [] args) {
			
	 int numbers[]= {0,1,2,3,4,5,6,7,8,9};
	
		System.out.println(numbers [4]);
}		
	
	protected void getProtected(int a) {
		System.out.println("you can access protected fields and methods only from the same package or extending classes"+a);
	}
}
