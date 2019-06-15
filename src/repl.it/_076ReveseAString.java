package repl.it;

import java.util.Scanner;

public class _076ReveseAString {

	public static void main(String[] args) {


		  Scanner scan = new Scanner(System.in);
		    String sentence = scan.nextLine();
		    int l=sentence.length()-1;
		    while(l>=0) {
		    	
		    	System.out.print(sentence.charAt(l));
		    	l--;
		    }
		    
	}

}
