package day40;

public class Computer {


		// provide instance variable/fields for the computer class
		//type, ram, screenSize, color, OS, isPersonal
		//its highly not recommended to have main method inside this class
		String type;		//type="unknown" ==> will be default value for type instance variable(proparty)
		int ram;
		double screenSize;
		String color;
		String OS;
		Boolean isPersonal;
		
		public void printInfo() {
			System.out.println("Type: " + type + ", OS: " + OS + ","
					+ " Color: " + color + ", Ram: " + ram + "GB, Personal? "
					+ isPersonal);
		}
	

	

}
