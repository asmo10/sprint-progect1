package repl.it;

import java.util.Scanner;

public class _091_Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.nextLine();
	    word = word.toLowerCase().replace(" ", "");
	    //WRITE YOUR CODE HERE

	    String w="";
	    for(int i=word.length()-1; i>=0; i--) {
	    	w+=word.charAt(i);
	    	   	
	    }
	    System.out.println(word.equals(w));
	}

}
