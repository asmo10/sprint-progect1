package repl.it;

import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class _083_Party {

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

	    System.out.println("Please enter guest name:");
	    String name=input.next();
	    String y="";
	   
	    System.out.println("Do you want to enter new guest name:");
	    y=input.next();
	    
	    while (y.equalsIgnoreCase("yes")){
		  
		    System.out.println("Please enter guest name:");
		    name+=", "+input.next();
		    
		    System.out.println("Do you want to enter new guest name:");
		    y=input.next();
	   }
	   
	   System.out.println("Guest's list: "+name);
	    
	    }
	    
	}


