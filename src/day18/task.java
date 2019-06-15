package day18;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {

	
		System.out.println("enter number");
		Scanner s= new Scanner(System.in);
		int n=0;
		n=s.nextInt();
		int x=0;
		
		while (x<=n) {
			System.out.print(x+++" ");
			
		}
	
		System.out.println("stop");
	}

}
