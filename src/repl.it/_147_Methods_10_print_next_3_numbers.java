package repl.it;

import java.util.Scanner;

public class _147_Methods_10_print_next_3_numbers {

	  public static void main(String[] args) {
		     Scanner inp = new Scanner(System.in);
		     System.out.print("enter number");
		     int num = inp.nextInt();
		     
		  
		     next3(num);
		  }
		  
	  public static void next3(int numNum) {
		  System.out.println((numNum+1)+" "+(numNum+2)+" "+(numNum+3));
		  
	  }
		 
		 
		}