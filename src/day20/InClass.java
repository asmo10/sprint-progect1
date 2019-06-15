package day20;

import java.util.Scanner;

public class InClass {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		String ch, name;
		System.out.println("Print your name ");
		name=sc.next();
		int x=0;
		do {
			System.out.print(name.charAt(x)+" (*_*) ");
			x++;
		}while(x<name.length());
		
	}

}
