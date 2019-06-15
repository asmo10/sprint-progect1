package day8;

public class TypeConversion {

	public static void main(String[] args) {
		
		//converting from one data type to another data type
		int medium = 10;
		
		long grande = medium; // type widening / upcasting
		
		short tall = (short)grande;	//type narrowing /downcasting
		
		double superGrande = 15.67d ;
		int mediumCup =(int) superGrande ;
		System.out.println(mediumCup);
	}

}
