package repl.it;

import java.util.Scanner;

public class _098_EqualsJavaPython {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		int cj = 0;
		int cp = 0;

		for (int i = 0; i <= sentence.length() - 4; i++) {
			
			if (sentence.substring(i, i + 4).equals("java")) {
				cj++;
			}

			if(!(i>sentence.length()-6)) {
			if (sentence.substring(i, i + 6).equals("python")) {
				cp++;
			}}

		}
//		System.out.println(cj);
//		System.out.println(cp);
		System.out.println(cj == cp);

	}
}
