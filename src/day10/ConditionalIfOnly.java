package day10;

import java.util.Scanner;

public class ConditionalIfOnly {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Okta To Slack");

		int lengthOfName = scan.nextInt();

		if (lengthOfName > 22) {
			System.out.println("Slack can not take more than 22 char user name has been adjusted");
			lengthOfName = 21;
			System.out.println("User name has been adjusted");
		}

		System.out.println("Seccessefully added user");

	}


		
		
	}


