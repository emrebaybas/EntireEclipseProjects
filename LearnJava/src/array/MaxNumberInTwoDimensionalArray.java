package array;

import java.util.Arrays;

public class MaxNumberInTwoDimensionalArray {

	public static void main(String[] args) {

		// int a[][]=new int[3][3];

		int b[][] = { { 1, 4, 8 }, { 12, 5, 73 }, { 43, 12, 5 }, { 12, 3, 25 } };

		int max = b[0][0];

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {

				if (max < b[i][j]) {
					max = b[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
