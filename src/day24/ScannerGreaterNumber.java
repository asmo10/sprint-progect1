package day24;

import java.util.Scanner;

public class ScannerGreaterNumber {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in) ; 
	    int[] arr = new int[3] ; 
	    int max=arr[0];
		 for (int i = 0; i < arr.length; i++) {
		      
		      System.out.println("enter number " + (i+1) );
		      arr[i] = scan.nextInt();
		      System.out.println("number "+(i+1)+" is "+ arr[i] );
		      
		      if( arr[i] > max ) {
		    	  max =  arr[i] ; 
		      }
	}
		 System.out.println("max num is: "+max);

}
}