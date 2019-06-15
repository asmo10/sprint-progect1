package day10;

import java.util.Scanner;

public class warmup {

	public static void main(String[] args) {

		long acnumb = 1234;
		String userPassword = "smo";
		
		Scanner scn = new Scanner(System.in);

		System.out.println("enter acount number");
		long ac = scn.nextLong();

		System.out.println("enter your password");
		String pass = scn.next();
		
		// if(ac==acnumb && p) {
		// boolean p=pass.equals("smo");
		if (ac == acnumb && userPassword.equals(pass)) {
			System.out.println("welcome");
		} else {
			System.out.println("who are you?");
		}
	}

}
