package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _119_ArraysConvertDecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.

		int n = 128;
		for (int i = 0; i < binary.length; i++) {

			if ((decimal/n) > 0 && (decimal/n) < 1) {
				n /= 2;
			} else {
			
				binary[i] = decimal/n;
				decimal = decimal % n;
				n /= 2;
			}
		}

		System.out.println(Arrays.toString(binary));

		
//		Integer.toBinaryString(decimal).toCharArray();
		
	}

}


	
