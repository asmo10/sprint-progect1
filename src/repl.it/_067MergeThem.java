package repl;

import java.util.Scanner;

public class _067MergeThem {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();

		    int w1 = word1.length();
		    int w2 = word1.length();
		    if(w1!=3  && w2!=3) System.out.println("cannot merge");
		    else 
		    	System.out.println(""+word1.charAt(0)+word2.charAt(0)
		    						+word1.charAt(1)+word2.charAt(1)
		    						+word1.charAt(2)+word2.charAt(2));
	}

}
