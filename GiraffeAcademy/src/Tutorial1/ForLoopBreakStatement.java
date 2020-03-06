package Tutorial1;

public class ForLoopBreakStatement {

	public static void main(String[] args) {

		String[] days = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
		for (int d = 0; d <= 6; d++) {

			if (d == 5 || d == 6.) {
				System.out.println("It is " + days[d] + ". Enjoy!");
				System.out.println();
				continue;
			}
			System.out.println("It's " + days[d] + ", go to work and attend the meetings");
			System.out.println();

			if (d == 2) {
				System.out.println("take a vocation from wednesday to monday");
				break;
			}
		}
	}
}
