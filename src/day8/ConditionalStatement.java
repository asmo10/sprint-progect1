package day8;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		double iphp=599.99, ipap=899.99, itemsiph, itemsipa;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many of Iphones you wnats to buy?: ");
		itemsiph=sc.nextDouble();
				
		System.out.println("How many of Ipads you wnats to buy?: ");
		itemsipa=sc.nextDouble();
		
		System.out.println("enter your budget: ");
		double b=sc.nextDouble();
				
		
		double tot=iphp*itemsiph+ipap*itemsipa;
		System.out.println("Your total purchase is: "+tot);
		
		if(b>tot) {
			System.out.println("I will take it");
		}else {
			System.out.println("You are out of budget");
			System.out.println("You need extra:"+(tot-b));
		}
		
	/*	System.out.println("I will take it");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
		if(score>60) {
			System.out.println("pass");
		}else {
			System.out.println("not pass");
		}*/
		
	}

}
