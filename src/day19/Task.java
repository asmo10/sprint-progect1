package day19;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		System.out.println("enter name");
		Scanner s= new Scanner(System.in);
		String name=s.nextLine();
		int aCount=0;
		int start=0;
		String reverse="";
		int x= name.length()-1;
		while(x>=0) {
			
			System.out.print(name.charAt(x)+"-");
			if(name.charAt(x)=='a') aCount+=1;
			
			x--;
		}
		while(x>0) {
			reverse= reverse+name.charAt(x);
			x--;
		}
		System.out.println();
		
		System.out.println("Is it Palindrome word ? - "+reverse+" - "+name.equals(reverse));
		
		System.out.println("count of \'a\' in your name: "+aCount);
		
	//	while(x>=0) {
			//System.out.print(name.charAt(x--)+"-");
			
	
	
	
	}

}
