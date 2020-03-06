package practice;

public class IfandElse {

	public static void main(String[] args) {
	
		
		int month=13;
		
		
//		if(month==12||month==1||month==2) {
//			System.out.println("It's winter");
//		}else if(month==3||month==4||month==5) {
//			System.out.println("It's spring");
//		}else if(month==6||month==7||month==8) {
//			System.out.println("It's summer");
//		}else if(month==9||month==10||month==11) {
//			System.out.println("It's fall");
//		}else {
//			System.out.println("its not a valid number");
//		}

		
		switch(month) {
		case(12):
		case(1):
		case(2):
			System.out.println("It's winter");
		break;
		case(3):
		case(4):
		case(5):
			System.out.println("It's spring");
		break;
		case(6):
		case(7):
		case(8):
			System.out.println("It's summer");
			break;
		case(9):
		case(10):
		case(11):
			System.out.println("It's fall");
		break;
		default:
			System.out.println("its not a valid number");
			

		}
		
	}

}
