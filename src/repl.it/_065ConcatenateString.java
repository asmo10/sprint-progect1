package repl.it;

import java.util.Scanner;

public class _065ConcatenateString {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    
		    String st=word1.concat(word2);
		    int len1=word1.length()-1;
		    int len2=word2.length()-1;
		    char lastchar1=word1.charAt(len1);
 
			if(lastchar1!=word2.charAt(0))	System.out.println(word1.concat(word2));
		    else	System.out.println((word1.substring(0, len1))+word2);
	}

}
