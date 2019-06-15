package repl.it;

import java.util.Scanner;

public class _103_CountCode {

	public static void main(String[] args) {

		 int count = 0;
		    Scanner scan = new Scanner(System.in);
		    String  str = scan.nextLine();
		   
		    int sum=0;
		    
		    for(int i=0; i<str.length()-3; i++) {
		    	
		    	if(str.charAt(i)=='c') {
		    		if(str.charAt(i+1)=='o') {
		    			if(str.charAt(i+3)=='e') {
		    				sum++;
		    			}
		    		}
		    	}
		    	
		    }
		    System.out.println(sum);
	}

}
