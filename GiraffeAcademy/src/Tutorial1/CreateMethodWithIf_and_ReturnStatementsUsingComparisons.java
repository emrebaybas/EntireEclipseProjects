package Tutorial1;

public class CreateMethodWithIf_and_ReturnStatementsUsingComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxMethod(30,400,5));
		
		}

	
	public static int maxMethod (int num1, int num2, int num3) {
		
		if (num1 >=num2 && num1>=num3) {
			return num1;
		} else if (num2 >=num1 && num2>=num3) {
			return num2;
		}else {
			return num3;
		}
		
	}

}
