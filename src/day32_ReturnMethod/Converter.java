package day32_ReturnMethod;

public class Converter {

	public static void main(String[] args) {

		System.out.println("met to cm: "+meterToCM(2));
		System.out.println("feet ot inch: "+feetToInch(2));
		System.out.println("far to celsium: "+faToCelcius(2));
		
		
	}

	public static double meterToCM(int inch) {
	return inch*100;
	
	}
	
	public static double feetToInch(int feet) {
		return feet*12;
	}
	public static double faToCelcius(int fa) {
		return (fa-32)/2;
	}
}
