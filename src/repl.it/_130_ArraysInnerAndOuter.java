package repl.it;

import java.util.Arrays;

import java.util.Scanner;

public class _130_ArraysInnerAndOuter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		// WRITE YOUR CODE HERE

		boolean match = false;
		
		if (outer.length >= inner.length) {

			for (int in = 0; in < inner.length; in++) {

				for (int out = 0; out < outer.length; out++) {
					if (inner[in] == outer[out]) {
						match = true;
						if (in == inner.length - 1)
							break;
						in++;
					} else {
						match = false;
					}		
				}

				
					break;

			}
		}
		System.out.println(match);

	}
}