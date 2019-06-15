package day19;

import java.util.Scanner;

public class PalindromeName {

	public static void main(String[] args) {

		
		    
		    Scanner scan = new Scanner(System.in);
		    System.out.println("ENTER A name");
		    // Ask user a name 
		    // for example  Bilal ----> B-i-l-a-l-
		    String name = scan.nextLine() ;
		    /// USING ABOVE CODE --> CREATE A PROGRAM 
		    // TO CHECK WHETHER A WORD IS PALINDROM 
		    //    ANA --> REVERSE -- ANA
		    //    CIVIC --> REVERSE -- CIVIC


		    int count = name.length() ;  // ABC 
		    String reversed = ""; 
		    
		    while(count>0) {


		      count-- ; 
		      reversed  = reversed + name.charAt(count) ; 
		      //reversed += name.charAt(count)
		      System.out.println( reversed  );      
		      
		    }
		    System.out.println( "PALINDROME " + name.equals(reversed) );
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    //System.out.println();
//		    System.out.print(name.charAt(0)+"-");
//		    System.out.print(name.charAt(1)+"-");
//		    System.out.print(name.charAt(2)+"-");
//		    System.out.print(name.charAt(3)+"-");
//		    System.out.print(name.charAt(4)+"-");
		    
		    
		    
		   




	}

}
