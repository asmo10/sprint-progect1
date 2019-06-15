package repl.it;

import java.util.Scanner;

public class _100_GreenTicket {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int prize = 0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		int[] lot = { a, b, c, d };
		int count = 0;

		for (int i = 0; i < lot.length - 1; i++) {

			for (int x = i; x < lot.length - 1; x++) {
				if (lot[i] == lot[x + 1]) {
					i++;
					prize += 10;
				}

			}

		}
		System.out.println(prize);

	}

}
