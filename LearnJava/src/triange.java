
public class triange {

	public static void main(String[] args) {

		int n = 8;

		for (int i = 0; i < n; i++) {

			// inner loop to handle number spaces
			for (int j = n - i; j > 1; j--) {
				System.out.print(" ");	// printing spaces
			}

			// inner loop to handle number of columns
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}
			System.out.println(); 	// ending line after each row
		}
	}
}
