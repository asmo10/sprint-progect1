package day18;

import java.util.Scanner;

public class GiveMeFive {

	public static void main(String[] args) {

		
		Scanner scan= new Scanner(System.in);
		int x=0;
		
		while(x!=5 && x!=10) {
			System.out.println("put only $5 or $10 dolar bill");
			x=scan.nextInt();
		}
		System.out.println("thanks");
	
	}

}
