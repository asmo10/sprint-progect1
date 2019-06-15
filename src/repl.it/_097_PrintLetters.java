package repl.it;

import java.util.Scanner;

public class _097_PrintLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);

		String alph = "";
		char i = 0;
		for (i = start; i <= end; i++) {

			

			System.out.print(i);

		}
	}

}
