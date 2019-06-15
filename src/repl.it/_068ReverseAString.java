package repl.it;

import java.util.Scanner;

public class _068ReverseAString {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();

	    int wl=word.length();
	    if(wl<5) 	System.out.println("Too short!");
	    else if(wl>5)	System.out.println("Too long!");
	    else	System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
	}

}
