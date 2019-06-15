package mentoring;

import java.text.DecimalFormat;

public class Math_Random {

	public static void main(String[] args) {
		double r1 = Math.random();				// 0 - 1   --> 0.48476050748907906
		System.out.println(r1);
		
		double r2 = Math.random() * 100d;		// 0 - 100  --> 31.82960384500195
		System.out.println(r2);
	
		double r3 = Math.round(r2);				// 32.0
		System.out.println(r3);
	
		double r4 = Math.round(Math.random()*100);		// 71.0
		System.out.println(r4);
		
		
		System.out.println("Our fahrenheit degree is: " + r4);
		
		double celsius = (5/9d) * (r4-32);
		
		System.out.println("The celcius degree is: " + celsius);    //  The celcius degree is: -14.444444444444445
		
		System.out.println("The celcius degree is: " + new DecimalFormat("##.#").format(celsius)  ); 
		
		//The celcius degree is: -13.333333333333334
		// The celcius degree is: -13.3
		System.out.println("The celcius degree is: " + new DecimalFormat("##.##").format(celsius)  ); 
		// The celcius degree is: 33.33

	}

}
