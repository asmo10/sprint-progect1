package repl.it;

import java.util.Scanner;

public class _118_ArraysSplitEmail {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		// Write your code below
		int at = 0;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@')
				at++;

		}

		String[] emarr = new String[2];
		if (at > 1 || at==0) {
			System.out.println("invalid email");
		} else {
			emarr = email.split("@");
			System.out.println("Email id: " + emarr[0]);
			System.out.println("Email domain: " + emarr[1]);

		}
	}

}
