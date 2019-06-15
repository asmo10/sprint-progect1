package day10;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("welcome to amazon");
		System.out.println("enter your price");
		double pr=sc.nextDouble();
		System.out.println("are you prime member?");
		String prmem=sc.next();
		
		//boolean prmem=sc.nextBoolean();
		//if(prmem)
		if(prmem.equals("yes"))
			System.out.println("you have free shiping");
		else if(pr<35)
			System.out.println("5$ shiping");
		else if(pr>=35)
	System.out.println("free shiping");
	}

}
