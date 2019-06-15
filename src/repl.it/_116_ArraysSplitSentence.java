package repl.it;

import java.util.Scanner;

public class _116_ArraysSplitSentence {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    //type your code below
		    
		    
		   String[] word=sentence.split(" ");
		   for (String n : word) {
			
			   System.out.print(n);
			   System.out.println();
		}
	}

}
