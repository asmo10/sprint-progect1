package repl;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class _122_2DArrayLargestNumber {
	static class Main {

		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			int rows = inp.nextInt(), cols = inp.nextInt();
			int[][] arr = new int[rows][cols];
			for (int i = 0; i <= rows - 1; i++) {
				for (int j = 0; j <= cols - 1; j++) {
					arr[i][j] = inp.nextInt();
				} // end for cols
			} // end for rows
			System.out.println(Arrays.deepToString(arr));
//   System.out.println(arr[rows-1].length); 
			// TODO write your code below
			int max = arr[0][0];

			for (int k = 0; k < arr.length; k++) {
				for (int k2 = 0; k2 < arr[k].length - 1; k2++) {
					System.out.println("max is " + max);
					System.out.println("first is " + arr[k][k2]);
					System.out.println("second is " + arr[k][k2 + 1]);

					if (arr[k][k2] < arr[k][k2 + 1]) {
						max = arr[k][k2 + 1];
						System.out.println("max overide is " + max);
					}
					if (arr[k][k2] > arr[k][k2 + 1]) {
						max = arr[k][k2];
						System.out.println("max overide is " + max);
					}
				}

			}

			System.out.println(max);

		}// end main
	}
}
