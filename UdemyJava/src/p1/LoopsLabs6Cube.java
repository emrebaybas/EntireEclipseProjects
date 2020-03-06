package p1;

public class LoopsLabs6Cube {

	public static void main(String[] args) {

		for (double i = 0; i <= 9; i++) {
			double a = i * i * i;

			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
	}
}
