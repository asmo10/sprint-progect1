package repl.it;

import java.util.Scanner;

public class _052WeekDays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter day number:");
		int d=scan.nextInt();
		
		switch(d) {
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wendnesday");
		break;
		case 4:System.out.println("thersday");
		break;
		case 5:System.out.println("friday");
		break;
		case 6:System.out.println("saturday");
		break;
		case 7:System.out.println("sunday");
		break;
		default:System.out.println("Invalid number!");
		break;
	}

}}
