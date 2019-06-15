package day9;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {
		
		System.out.println("Enter two whole number: ");
		int a, b;
		Scanner warmup=new Scanner(System.in);
		a=warmup.nextInt();
		b=warmup.nextInt();
		int c= a+b;
		if(c>100) {System.out.println("Your summary is: "+c);
	}else {System.out.println("Enter biger numbers:");}
	} 

}
