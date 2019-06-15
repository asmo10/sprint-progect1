package repl.it;

import java.util.Scanner;

public class _089_ {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    String str=scan.next();
	    
	    if(str.length()>=3) {
	    if(str.substring(0,4).contains("java")) {
	    	System.out.println(str.substring(0,4).contains("java"));
	    }
	    
	    else if(str.substring(1,5).contains("java")) {
	    	System.out.println(str.substring(1,5).contains("java"));
	    }
	    else 	{
	    	System.out.println("false");
	    }}
	    else 	{
	    	System.out.println("false");
	
	    }
	    
	}

}
