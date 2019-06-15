package repl.it;

import java.util.Scanner;

public class _102_SumDigits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int sum  = 0;
	    
	    for (int i = 0; i < str.length(); i++) {
	    	
	    	if(Character.isDigit(str.charAt(i))){
	    		int num=Integer.parseInt(str.substring(i,i+1));
	    		sum+=num;
	    		
	    		
	    	}
			
		}
	    System.out.println(sum);
	}

}
