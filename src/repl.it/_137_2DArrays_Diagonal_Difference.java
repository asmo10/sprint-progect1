package repl.it;

import java.util.Scanner;

public class _137_2DArrays_Diagonal_Difference {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
		int result = 0;
		int diagonal1 = 0;
		int j = 0;
		for (int i = 0; i < matrix.length; i++) {
			diagonal1 += matrix[i][j];
			j++;
		}

		int diagonal2 = 0;
		int k = 2;
		for (int i = 0; i < matrix.length; i++) {
			diagonal2 += matrix[i][k];
			k--;
		}
		result = diagonal1 - diagonal2;

		// FINAL PRINT
//		System.out.println(diagonal1+"\n"+diagonal2);
//		System.out.println(result);
		System.out.println(Math.abs(result));
	}

}
