package repl.it;

import java.util.Scanner;

public class _057PrintLastCharacter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int lenght=word.length()-1;
	    System.out.println(word.charAt(lenght));
	}

}
