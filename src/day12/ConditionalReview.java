package day12;

import java.util.Scanner;

public class ConditionalReview {

	public static void main(String[] args) {
		int a, b;
		String weather, action;
		Scanner scan = new Scanner(System.in);
		System.out.println("what's weather like today?");
		weather = scan.next();
		
		action = (weather.equalsIgnoreCase("sunny")) ? "go outside" : "stay home";
		System.out.println(action);
		

	}

}
