package day11;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		String a;
		Scanner scan = new Scanner(System.in);
				
		a = scan.next();
		if(a.equals("yes")) {
			System.out.println("what day of the week is good for you?");
			String day = scan.next();
			System.out.println("Your  year old \n "
					+ "will be scheduled for a servise appoitment on"+day);
		}else {System.out.println("Come back later");}
	}

}
