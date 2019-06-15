package repl.it;

import java.util.Scanner;

public class _120_ArraysReverseSentence {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //TODO: Type your code below
		
		String[] revword=sentence.split(" ");
			for (int i = revword.length-1; i >=0; i--) {
			System.out.print(revword[i]);
			System.out.println();
		}
	
	}
	}

