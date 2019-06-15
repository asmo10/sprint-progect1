package day9;

import java.util.Scanner;

public class StringEqvality {

	public static void main(String[] args) {
	
		//String name= 
		
		//String name = "Andy";
		Scanner ask=new Scanner(System.in);
		System.out.println("Print a name");
		String name1 = ask.next();
		boolean b = name1.equals("Andy");
		
		if(name1.equals("Andy")) {	
		System.out.println("Good name Andy");
		}else{
			System.out.println("no good");
		}		
	}

}
