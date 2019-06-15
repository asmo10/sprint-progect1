package repl;

public class _160_Methods_with_return_6_water_tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public double waterTax(double units) {
		double bill = 0.0;

		// your code here
		if (units <= 50)
			bill = units * 0.60;
		else if (units > 150)
			bill = units * 0.90 + 100;
		else if (units > 100)
			bill = units * 0.90 + 50;
		else if (units > 50)
			bill = units * 0.90;
	
		// end your code here

		return bill;
	}// end waterTax

}
