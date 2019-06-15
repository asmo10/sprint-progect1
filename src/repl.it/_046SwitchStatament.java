package repl.it;

import java.util.Scanner;

public class _046SwitchStatament {

	public static void main(String[] args) {

		char response='a';
		Scanner s=new Scanner(System.in);
		System.out.println("enter Command");
		//String res=s.next();
		response=s.next().charAt(0);
				
		switch(response) {
		case 'y': System.out.println("Your request is being processed is printed");
		break;
		case 'n': System.out.println("Thank you anyway for your consideration is printed");
		break;
		case 'h': System.out.println("Sorry, no help is currently available ");
		break;
		default: System.out.println("Invalid entry, please try again!");
		
		
		}
		
	}

}
