package day8;

import java.util.Scanner;

public class phoneNamber {

	public static void main(String[] args) {

		int areaCode;
		long localNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your area code: ");
		areaCode=input.nextInt();
		System.out.println("Enter your phone number: ");
		localNumber=input.nextLong();
		System.out.println("Your Calling number is: "+"("+areaCode+")"+"-"+localNumber);
		
	}

}
