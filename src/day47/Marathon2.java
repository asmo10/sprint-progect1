package day47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Marathon2 {

	public static void main(String[] args) {

		
		Bike2 b1 = new Bike2("Kawasaki", 4, 80);
	    Bike2 b2 = new Bike2("Ducati", 5, 90);
	    Bike2 b3 = new Bike2("Yamaha", 4, 88);
	    Bike2 b4 = new Bike2("Harley-Davidson", 3, 70);  
	
//	   ArrayList<Bike> allBikes= new ArrayList<>(Arrays.asList(b1,b2, b3, b4)); 
//	   for (int i = 0; i < allBikes.size(); i++) {
//		System.out.println(allBikes.get(i));
//	} 
//	   
//	   System.out.println("--------------------------");
//	    for( Bike each : allBikes) {  
//	      
//	      System.out.println(each);
//	      System.out.println(  each.getId()  +" ---" +  each.getBrand()   );
//	    }
	Bike2.showCurrentCount();

	b1.slowDown(120);
	b3.speedUp(45);
//	System.out.println(b1.getSpeed());
	Bike2 nav3 = new Bike2("honda", 3, 33);
//	System.out.println(nav3.getSpeed());
	}
	
}
