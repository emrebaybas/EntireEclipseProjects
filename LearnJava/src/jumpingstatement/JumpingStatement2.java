package jumpingstatement;

public class JumpingStatement2 {

	public static void main(String[] args) {

		for (int i = 10; (i >= 10 && i<=25); i++) {

			if (i == 11 || i == 13 || i == 15 || i == 17 || i == 19) {

				continue;
			}
			System.out.println(i);
		}
	}
}
