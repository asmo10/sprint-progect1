package repl.it;

import java.util.Scanner;

public class _043RealEstateCalculator043 {

	public static void main(String[] args) {
		int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		garageSpots=0;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");

		System.out.println("Enter your property type:");
		houseType = scan.next();
		if(houseType.equalsIgnoreCase("Condo")){
			propertyPrice =50000;
		}else if(houseType.equalsIgnoreCase("Townhouse")){
			propertyPrice =75000;
		}else if(houseType.equalsIgnoreCase("Single Family Home")){
			propertyPrice = 95000; }
			
		System.out.println("How many bedrooms do you have?");
			numberOfBedrooms=scan.nextInt();
			
		System.out.println("Do you have a backyard?");
			backyard=scan.nextBoolean();
			if ((houseType.equalsIgnoreCase("Condo")) && backyard) {System.out.println("Backyard is not available for condo!");
			backyard=false;
			}else {propertyPrice+=5000;}
			
		System.out.println("Do you have garage?");
			garage=scan.nextBoolean();
			if(!garage) { garageSpots=0;
			}else if(garage) {System.out.println("How many spots?");
			garageSpots = scan.nextInt();}
			if((garageSpots>10) || (garageSpots<0)) {
			System.out.println("Pardon, it's not a pablic parking!");
			garageSpots=0;}
			
		System.out.println("How close is metro station?");
			metroAccessibility =scan.nextFloat();
			if(metroAccessibility<=1) {metroAccessibility=10000;
			}else if((metroAccessibility>1) && (metroAccessibility<3)){metroAccessibility=5000;
			}else {metroAccessibility=0;}
			
		System.out.println("How close is highway");
			highwayAccessibility = scan.nextFloat();
			if(highwayAccessibility<=1) {highwayAccessibility=15000;
			}else if((highwayAccessibility>1) && (highwayAccessibility<5)){highwayAccessibility=8000;
			}else if((highwayAccessibility>5) && (highwayAccessibility<20)){highwayAccessibility=4000;
			}else {highwayAccessibility=0;}
		
		System.out.println("What's the rating of nearest school?");
			schoolScore=scan.nextFloat();
			if((schoolScore>=8) && (schoolScore<=10)){schoolScore=45000;
			}else if((schoolScore>=4) && (schoolScore<8)){schoolScore=20000;
			}else {schoolScore=5000;}
		
		System.out.println("Does any of your family members smoking?");
			smoking = scan.nextBoolean();
			if(smoking)propertyPrice-=5000;
			
			propertyPrice =(int) (propertyPrice+(30000*numberOfBedrooms)+
					(20000*garageSpots)+metroAccessibility+highwayAccessibility+schoolScore);
			
			System.out.println("Market report has been generated. \n"
					+ "Your estimate market price is: "+propertyPrice+"$");
			
			}}
