package day12;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		int dayNum;
		String dayWord="";
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter day number: ");
		dayNum = s.nextInt();
	
		switch(dayNum) {
		case 1:
			dayWord = "Monday";
			//break;
		case 2:
			dayWord = "Tuesday";
			break;
		case 3:
			dayWord = "Wednesday";
			break;
		case 4:
			dayWord = "Thursday";
			break;
		case 5:
			dayWord = "Friday";
			break;
		case 6:
			dayWord = "Saturday";
			break;
		case 7:
			dayWord = "Sunday";
			break;
		default:
			System.out.println("Invalid number");
			break;

	}
		System.out.println(dayWord);
}}
