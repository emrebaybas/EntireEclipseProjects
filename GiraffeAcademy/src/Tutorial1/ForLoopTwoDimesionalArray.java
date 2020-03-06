package Tutorial1;

public class ForLoopTwoDimesionalArray {

	public static void main(String[] args) {

		String[][] books = { { "book1", "book2", "book3" },
				{ "book4", "book5", "book6" },
				{ "book7", "book8", "book9" } };

		for (int i = 0; i < books.length; i++) {
			for (int j = 0; j < books[i].length; j++) {
				System.out.print(books[i][j] + " ");
			}
			System.out.println(""); 
		}
	}
}
