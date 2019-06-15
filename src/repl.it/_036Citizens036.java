package repl.it;

import java.util.Scanner;

public class _036Citizens036 {

	public static void main(String[] args) {
		
		int seniorCitizens, nonSeniorCitizens, age;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		seniorCitizens=scan.nextInt();
		nonSeniorCitizens=scan.nextInt();
		System.out.println("What is new citizen's age?");
		age = scan.nextInt();
		
		if (age>=65) {
			System.out.println("Senior Citizen\n"
					+ "New seniorCitizens count " + ++seniorCitizens
					+ "\nNew nonSeniorCitizens count " +nonSeniorCitizens);
	}else if(age<65) {
		System.out.println("Non Senior Citizen\n"
				+ "New seniorCitizens count " + seniorCitizens
				+ "\nNew nonSeniorCitizens count " + ++nonSeniorCitizens);
	}
		

	}

}
