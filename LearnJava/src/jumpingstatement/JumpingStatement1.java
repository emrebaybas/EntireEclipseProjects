package jumpingstatement;

public class JumpingStatement1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			
			
			if (i == 3){

				continue;
			}									//if you use continue it will only skip that condition but will continue
												//see it did not print 3
			
			else if (i == 8){       // but if you use break it will just break and stop there

				break;
			}
			System.out.println(i);
		}
	}
}
