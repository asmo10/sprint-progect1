package repl.it;

import java.util.Scanner;

public class _069CarInsuranceWorks {

	public static void main(String[] args) {


		 double premium = 0;
			int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the CountyFarm car insurance!");

			//------------
		
		System.out.println("Enter your name");
		name=scan.next();
		System.out.println("Do you have a US driver license?");
		String dl=scan.next();
		if(!dl.equalsIgnoreCase("yes")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		System.out.println("Enter your zip code");
		int zipcode=scan.nextInt();
		if(zipcode==20910 || zipcode==20740) premium +=60;
		else if(zipcode==22102 || zipcode==22103) premium +=30;
		else premium +=50;
		
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership=scan.next();
		if(vehicleOwnership.equalsIgnoreCase("owned")) premium +=10;
		else premium +=20;
		
		
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage=scan.next();
		vehicleUsage=vehicleUsage.toLowerCase();
		switch(vehicleUsage) {
		case "business": premium +=50;
		break;
		case "pleasure": premium +=10;
		break;
		case "commute": premium +=20;
				
		System.out.println("Days Driven To Work And/Or School");
		daysDrivenToWorkOrSchool=scan.nextInt();
		premium+=daysDrivenToWorkOrSchool*5;

		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool=scan.nextInt();
		premium+=milesToWorkOrSchool;
		break;
		}
		
		System.out.println("How old are you?");
		int age=scan.nextInt();
		if(age<16) {System.out.println("Invalid data!");
		System.exit(0);}
		else if(age>=16 && age<18) premium*=20;
		else if(age>=18 && age<=21) premium*=6;			
		else if(age>21 && age<25) premium*=2;
		
		System.out.println("How many years you've been driving?");
		int exp=scan.nextInt();
		if((exp<0) && ((age-exp)<16)) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		premium-=exp*5;
		
		System.out.println("Have you had any accidents in the last 5 years?");
		String ac=scan.next();
		if(ac.equalsIgnoreCase("yes")) {
		System.out.println("How many?");
		accidentsAmount=scan.nextInt();
		premium+=premium*0.2*accidentsAmount;
		}
		
	
	  System.out.println("Have you had continuous insurance for the past 12 months?");
	  continuousInsurance=scan.next();
	  if(continuousInsurance.equalsIgnoreCase("no")) { premium*=2; 
	  }
	 
	  	education=scan.nextLine();
	  	System.out.println("What is the highest level of education you have completed?");

education=scan.nextLine();
if(education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")){
premium -= premium*0.05;
}else if(education.equalsIgnoreCase("Doctors")){
premium -= premium*0.1;
}else if(education.equalsIgnoreCase("Less than High School")){
premium += premium*0.05;
}
education = education.replace(" ", "");


		
		System.out.println(name+", here's your quote!");
		System.out.println("Start Your Policy Today For: $"+premium);
		referenceNumber=name.substring(0, 2)+age+name.substring((name.length()-2))+zipcode+education.replaceAll(" ","");;
		System.out.println("Reference number: "+referenceNumber.toUpperCase());
		System.exit(0);
		



	}

}
