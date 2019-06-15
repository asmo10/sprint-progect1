package day11;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int number=scan.nextInt();
		
		String result;
		
//		if(number%5==0 && number%3==0) {
		System.out.println("fizz buzz");
//	}else if (number%5==0) {
//			System.out.println("fizz");
//			
//		}else if(number%3==0) {
//			System.out.println("buzz");
//			
//		}
//			
//		

		result=(number%5==0 && number%3==0) ? "FizzBuzz" : "Not Fizz Buzz";
		System.out.println(result);
	}

}
