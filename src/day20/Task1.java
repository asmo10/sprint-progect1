package day20;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("*****The program will coun summary from 0 to limit you set******");
		System.out.println("*************************************************");
		System.out.println("enter a limit number: ");
		int num=sc.nextInt();
		int sum=0;
		int x=0;
		do {
		
			sum+=++x;
//			if(sum>=40) {System.out.println("break, next sum more than 40");
//			break;}
			System.out.println("num is: "+x+ " sum is: " +sum);
				
		}while(x<num);
		System.out.println("limit of num is: "+num);
		System.out.println("Total sum is: "+sum);
	}

}
