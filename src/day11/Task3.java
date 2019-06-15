package day11;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		double price;
		String label;
		String a = "hello";
		
		Scanner scan= new Scanner(System.in);
		price = scan.nextDouble();
		
		label = (price>100) ? "expensive" : a;
		System.out.println(label);

	}

}
