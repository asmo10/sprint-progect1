package day44_2_eveving;

import java.util.Scanner;

public class MathOperationsHomeWork {

	public static void main(String[] args) {

		 // HOMEWORK
	    // CREATAE A LIST OF OPERATIONS
	    // USE SCANNER TO SET VALUES

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter second number: ");
		int num2=scan.nextInt();
		System.out.println("Enter the operator: ");
		char operator=scan.next().charAt(0);
			
		MathOperations homework=new MathOperations(num1, num2, operator);
		System.out.println(homework);
	}

}
