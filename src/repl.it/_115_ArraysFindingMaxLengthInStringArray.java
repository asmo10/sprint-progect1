package repl.it;

import java.util.Scanner;

public class _115_ArraysFindingMaxLengthInStringArray {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			  
			}
			
			//write your code below
			int greater=0;
			for (int i = 0; i < words.length-1; i++) {
				if(words[i].length()>words[i+1].length())
					greater=i;
				else 
					greater=words.length-1;
				
				
			}
			System.out.println(words[greater]);
	
	}

}
