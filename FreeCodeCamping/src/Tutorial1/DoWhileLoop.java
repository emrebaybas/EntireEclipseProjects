package Tutorial1;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//Difference between the DoWhileLoops and WhileLoops is  in DoWhileLoops it will go ahead and print the first line 
		//without checking the conditions. then it will go into whileloop and check the condition and it condition is met it will keep looping 
		//until condition is not met.
		// you finish the while loop inside the loop finish with semicolon;
		int i = 12;
		
		do {
			System.out.println(i);
			i++;
		}while (i<=10);
			
	}
}
