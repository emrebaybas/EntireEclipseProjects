package Tutorial1;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean isMale = false;
		boolean isTall = false;
		
		if (isMale && isTall) {
			System.out.println("You are a tall male");
		}
		else if (isMale && !isTall) {
			System.out.println("You are a  male but not tall");		
		}
		else if (!isMale && isTall) {
			System.out.println("You are tall but not a male");	
		}
		else  {
			System.out.println("You are neither male nor tall");
		}
	}

}
