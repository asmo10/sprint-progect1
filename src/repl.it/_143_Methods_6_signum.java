package repl.it;

import java.util.Scanner;

public class _143_Methods_6_signum {

	 
	  public static void sign(int n)
	  {
	    //your code here
	    if(n>0) System.out.println("1");
	    if(n==0) System.out.println("0");
	    if(n<0) System.out.println("-1");

	    
	    
	  }//end sign
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	  }
	}
