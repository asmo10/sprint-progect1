package repl.it;

import java.util.Scanner;

public class _088_CatsAndDogs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();

		String wcharplus = "";

		for (int i = 0; i < word.length(); i++) {

			wcharplus += word.charAt(i);

			if (wcharplus.contains("cat")) {
				countOfCats++;
				wcharplus = wcharplus.substring(wcharplus.indexOf("cat") + 3);
//				System.out.println(countOfCats+" c");
			}

			if (wcharplus.contains("dog")) {
				countOfDogs++;
				wcharplus = wcharplus.substring(wcharplus.indexOf("dog") + 3);
//				System.out.println(countOfDogs+" d");
			}
		}
		System.out.println(countOfCats == countOfDogs);

	}
}