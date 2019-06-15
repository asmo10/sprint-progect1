package day9;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {


			Scanner scan = new Scanner(System.in);
			
			System.out.println("enter your name");
			String name=scan.next();
			
			System.out.println("enter your last name");
			String lname = scan.next();
			
			boolean n = name.equals("Andy");
			boolean ln = lname.equals("Smo");
			
			if(n && ln) {
				System.out.println("Welcome");
			}else {
				System.out.println("Who are you?");
			}
			
	}

}
