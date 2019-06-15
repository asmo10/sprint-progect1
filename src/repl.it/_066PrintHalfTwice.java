package repl.it;

import java.util.Scanner;

public class _066PrintHalfTwice {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();



	    int mid=(word.length())/2;
	    System.out.println(word.substring(0, mid)+word.substring(0, mid));
	}

}
