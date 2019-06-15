package repl.it;

import java.util.Scanner;

public class _070WithoutX_x {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word=scan.next();
		int len =word.length();
		if((word.charAt(0)=='x' || word.charAt(0)=='X')) {
			word=word.substring(1);
		}
		if(((word.charAt(len-2))=='x') || ((word.charAt(len-2))=='X')) {
		word=word.substring(0, len-2);
		}
		System.out.println(word);
	}

}
