package day11;

import java.util.Scanner;

public class CalculatorSwichStatement {

	public static void main(String[] args) {
		
		// ask 2 numbers from the user
	    // ask the operation from the user
	    Scanner scan = new Scanner(System.in); 
	    
	    System.out.println("Enter 2 numbers : ");
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    System.out.println("enter operator +, -, *, /, ");
	    String operator = scan.next(); 
	    
	    
	    switch(operator){ 
	    case "+":
	      System.out.println("the addition result is " + (num1+num2));
	    break;
	    case "-":
	      System.out.println("the substarction result is " + (num1-num2));
	    break;
	    case "*":
	      System.out.println("the multiplication result is " + (num1*num2));
	    break;
	    case "/":
	      System.out.println("the division result is " + (num1/num2));
	    break;
	    default:
	      System.out.println("INVALID OPERATOR!");
	  break;}
	     
	}
	    
	    

	}

	

	


