package repl.it;

import java.util.Scanner;

public class _085_RepeatSeparator {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();

	    String tot="";
	    
	    for(int x=1; x<=count; x++) {
	    	if(x==count) 
	    	tot+=word;
	    
	    	else
	    	tot+=word+separator;
	    }
	    System.out.println(tot);
	    
	}

}
