package repl.it;

import java.util.Scanner;

public class _058PrintTheLongestWord {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    System.out.println(   (word1.length()>word2.length()) ? word1:word2);
		
	}

}
