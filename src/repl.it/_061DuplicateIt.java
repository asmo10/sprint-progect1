package repl.it;

import java.util.Scanner;

public class _061DuplicateIt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    
	    System.out.println(word1+word2+word2+word1);
	}

}
