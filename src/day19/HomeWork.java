package day19;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

//		Create a program that ask user a sentence (may or may not contain number) 
//		and store numerical and non-numerical part separately and print out the results. 
//		Also print out the count of the characters from a-z


		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a sentens:");
		String sent=scan.nextLine();
		String numeric="";
		String nonnum="";
		int len=sent.length();
		char ch;
		int x=0;
		int chnum=0;
		do {
			ch=sent.charAt(x);
			if(ch>='0' && ch<='9') 
			numeric+=ch;
			else if(ch>='a' && ch<='z') {
			nonnum+=ch;
			chnum++;
			}
			x++;
			
		}while(x<len);
		
		System.out.println("numeric: "+numeric);
		System.out.println("non-numeric: "+nonnum);
		System.out.println("number of characters from a-z is: "+chnum);
	}

}
