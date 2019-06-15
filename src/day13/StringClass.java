package day13;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		
		System.out.println("enter two names");
		Scanner scan = new Scanner(System.in);
		String n1, n2;
		n1=scan.next();
		n2=scan.next();
		
		System.out.println((n1.equalsIgnoreCase(n2)) ? "equal":"not equal");
		
		int n1l=n1.length();
		int n2l=n2.length();
		System.out.println(((n1l>n2l)? n1.charAt(1):n2.charAt(2) ));
		
		

	}

}
