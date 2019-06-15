package repl.it;

import java.util.Scanner;

public class _152_Methods_15_Print_unique_words {

	public static void main(String[] args) {

		  Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    String[] words = new String[size];
		    for(int i=0; i < size; i++){
		      words[i] = scan.next();
		    }
		    printUniqueWords(words);
		  }
		  
		  public static void printUniqueWords(String[] words){
		    //WRITE YOUR CODE HERE
			  boolean unikW=false;
			   for (int i = 0; i < words.length; i++) {
			for (int k = 0; k < words.length; k++) {
				if(words[i].equals(words[k]) && i!=k) {
					unikW=false;
					break;
				}else {unikW=true;	
				}
				
			}
			if(unikW) System.out.println(words[i]);
			}}}
			   
		    
		 