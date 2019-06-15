package repl.it;

import java.util.Scanner;

public class _059PintFirstAndLastLeater {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int l=word.length()-1;
	    char a=word.charAt(0);
	    char b=word.charAt(l);
	    System.out.println(a+""+b);
	}

}
