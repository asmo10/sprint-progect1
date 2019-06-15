package repl.it;

import java.util.Scanner;

public class _054FindAUser {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter full name:");
		String n=sc.nextLine();
		n=((n.equalsIgnoreCase("Max Payne")) || (n.equalsIgnoreCase("Alan Wake")))? "User found!":"User not found!";
		System.out.println(n);
	}

}
