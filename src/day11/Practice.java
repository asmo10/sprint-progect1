package day11;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		int year, input, age, option;
		String make, model, a;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you car make");
		make= scan.next();
		System.out.println("Enter your car model");
		model= scan.next();
		System.out.println("what year");
		year= scan.nextInt();
		age= 2019-year;
		
		System.out.println("You have a "+make+" "+model+" "+age+" years old.\n Chose one option below");
		System.out.println("1 - service \n"
				+ "2 - sales\n"
				+ "3 - fleet department\n"
				+ "4 - next avalible associate");
		option = scan.nextInt();
		
		switch(option){
		case 1: 
			System.out.println("you chose service");
			System.out.println("do you want to schedule a service appoitment?");
			a = scan.next();
			if(a.equals("yes")) {
				System.out.println("what day of the week is good for you?");
				String day = scan.next();
				System.out.println("Your "+make+" "+model+" "+age+" year old \n "
						+ "will be scheduled for a servise appoitment on "+day);
			}else if(a.equals("no")) {System.out.println("Come back later");
			}else {System.out.println("are you stupid!\nWrong entry !!! print \"yes\" or \" no\"" );}
			
			
			break;
		case 2:
			System.out.println("you chose sales");
			System.out.println("----------------\n"
					+ "we transfer you to sales\n "
					+ "-------------");
			break;
		case 3:
			System.out.println("you chose fleet department");
			System.out.println("----------------\n"
					+ "we transfer you to fleet department\n "
					+ "-------------");
			break;
		case 4:
			System.out.println("you chose next avalible associate");
			System.out.println("----------------\n"
					+ "we transfer you to next avalible associate\n "
					+ "-------------");
			break;
			default:
				System.out.println("Invalid entry");
				break;
						}
		
		
		
		
		
		
		

	}

}
