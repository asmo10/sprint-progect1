package repl.it;

import java.util.Scanner;

public class _023PatientInformation023 {

	public static void main(String[] args) {

			String firstName, lastName, fullName, email, street, state, city, address, contants;
			int age, zip;
			double height,weight;
			boolean isMarried;
			long workPhoneNumber, personalPhoneNumber;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the patient portal");
			System.out.println("Please enter your personal information ");
			System.out.println("Enter your first name ");
			firstName = scan.next();
			
			System.out.println("Enter your last name ");
			lastName = scan.next();
			
			System.out.println("Enter your email ");
			email = scan.next();
			
			System.out.println("Enter your street ");
			street = scan.next();
			
			System.out.println("Enter your city ");
			city = scan.next();
			
			System.out.println("Enter your state ");
			state = scan.next();
			
			System.out.println("Enter your zip code ");
			zip = scan.nextInt();
			
			System.out.println("Enter your work phone number");
			workPhoneNumber = scan.nextInt();
			
			System.out.println("Ener your personal phone number");
			personalPhoneNumber = scan.nextInt();
			
			System.out.println("Enter your age ");
			age = scan.nextInt();
			
			System.out.println("Enter your height"); 
			height = scan.nextDouble();
			
			String contact=firstName;
			
	}

}
