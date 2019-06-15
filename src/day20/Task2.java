package day20;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int i;
		for(i= sc.nextInt(); i<=10; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("enter a number to revers");
		for(i= sc.nextInt(); i>=0; i--) {
			System.out.print(" " +i);
		}
	}

}
