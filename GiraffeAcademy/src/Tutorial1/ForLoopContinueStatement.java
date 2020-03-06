package Tutorial1;

public class ForLoopContinueStatement {

	public static void main(String[] args) {

		for (int day = 1; day <= 7; day++) {
			if (day == 6 || day == 7) {
				System.out.println("It is the weekend. Enjoy!");
				System.out.println();
				continue;
			}if (day==1) {
			System.out.println("It's monday, go to work and attend the meetings");
			System.out.println();}
			if (day==2) {
				System.out.println("It's tuesday, go to work and attend the meetings");
				System.out.println();}
			if (day==3) {
				System.out.println("It's wednesday, go to work and attend the meetings");
				System.out.println();}
			if (day==4) {
				System.out.println("It's thursday, go to work and attend the meetings");
				System.out.println();}
			if (day==5) {
				System.out.println("It's friday, go to work and attend the meetings");
				System.out.println();}
		}
	}
}
