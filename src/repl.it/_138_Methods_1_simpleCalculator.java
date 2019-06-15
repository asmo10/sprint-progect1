package repl.it;

import java.util.Scanner;

public class _138_Methods_1_simpleCalculator {

	public static void main(String[] args) {

		
	      plus();
	  }
	  
	  public static void plus(){
	     
	    //your code here
		  Scanner scan= new Scanner(System.in);
		  System.out.println("enter first number:");
		  int fnum=scan.nextInt();
		  System.out.println("enter second number:");
		  int snum=scan.nextInt();
		  int result=fnum+snum;
		  System.out.println("result: "+result);
		  
		  
	}

}
