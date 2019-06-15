package repl.it;

import java.util.Scanner;

public class _064SwapFirstAndLastChar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    
	    int l=word.length()-1;
	    String mid=word.substring(1,(l));
	    System.out.println(word.charAt(l)+mid+word.charAt(0));
	}

}
