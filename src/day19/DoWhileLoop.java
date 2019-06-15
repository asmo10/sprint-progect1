package day19;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		int x= 1;
//		
//		 while(x<6) { System.out.println(x++); }
//		
		
		do {
			System.out.print(x+++"-");
		}while(x<=100);
		
		System.out.println();
		x=100;
		do {
			System.out.print(x--+"-");
		}while(x>0);
		
		System.out.println();
		System.out.println("Enter a number: ");
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		do {
			System.out.print(x--+"-");
		}while(x>0);
		System.out.println();
		System.out.println("x = "+x);
	}

}
