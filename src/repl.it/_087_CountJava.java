package repl.it;

import java.util.Scanner;

public class _087_CountJava {

	public static void main(String[] args) {

		 Scanner scan= new Scanner(System.in);
		    String word = scan.next();

		    String target="java";
		    
		    int n=0;
	
//		    System.out.println(word.contains(target));
		    while(word.contains(target)) {
		n++;
//		System.out.println(word.indexOf(("java")+1));
		
		word=word.substring(word.indexOf(target)+target.length());
//		System.out.println(word);
//		System.out.println(n);
	}
		    
		 System.out.println(n);
		 
	  
		    
	}

}
