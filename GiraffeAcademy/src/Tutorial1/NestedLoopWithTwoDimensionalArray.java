package Tutorial1;

public class NestedLoopWithTwoDimensionalArray {

	public static void main(String[] args) {

		String[][] letters = {

				{ "a", "b", "c", "d", "x" }, { "e", "f", "g", "h", "y" }, { "i", "k", "l", "m", "z" },
				{ "n", "o", "p", "r", "t" } };

		for (int i = 0; i < letters.length; i++) { // in this line used letters.length its 4

			for (int j = 0; j < letters[0].length; j++) {// however in this line i used letters[0].length its 5 to cover
															// everything
				System.out.println(letters[i][j]);
			}
		}

	}

}
