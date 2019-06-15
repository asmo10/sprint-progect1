package day12;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		int dayNum;
		String dayWord;
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter day number: ");
		dayNum = s.nextInt();
		
		switch(dayNum) {
		case 1:
			System.out.println("day # "+dayNum+" is Monday.");
			break;
		case 2:
			System.out.println("day # "+dayNum+" is Tuesday");
			break;
		case 3:
			System.out.println("day # "+dayNum+" is Wensday");
			break;
		case 4:
			System.out.println("day # "+dayNum+" is Therthday");
			break;
		case 5:
			System.out.println("day # "+dayNum+" is Friday");
			break;
		case 6:
			System.out.println("day # "+dayNum+" is Saturday");
			break;
		case 7:
			System.out.println("day # "+dayNum+" is Sunday");
			break;
		default:
			System.out.println("Invalid number, type 1-7");
			break;
		}

	}

}
