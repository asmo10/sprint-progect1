package repl.it;

import java.util.Scanner;

public class _062MiddleOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int l = word.length();

		if (l % 2 != 0 && l >= 3)
			System.out.println(word.charAt((l - 1) / 2));
		else if (l == 1)
			System.out.println(word + word + word);
		else if (l % 2 == 0 && l >= 4)
			System.out.println((word.charAt((l - 1) / 2)) + "" + (word.charAt(l / 2)));
		else if (l % 2 == 0 && l == 2)
			System.out.println(word + word);

	}

}
