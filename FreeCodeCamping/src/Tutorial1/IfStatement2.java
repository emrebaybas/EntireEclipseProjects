package Tutorial1;

public class IfStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean isRich = false;
		boolean isHandsome= false;
		
		if (isRich && isHandsome) {
			System.out.println("He is  rich and handsome");
		}
		else if (isRich || isHandsome) {
			System.out.println("He is either rich or handsome");
		}	
		else {
				System.out.print("He is neither rich nor handsome");
			}
		}	
	}


