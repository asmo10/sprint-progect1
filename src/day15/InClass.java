package day15;

public class InClass {

	public static void main(String[] args) {

		// char , boolean, 
				// byte, short , int , long , float , double
				
				// type conversion -- casting 
				
				//  byte --> int   upcasting / type widening 
				//  this happens implicitly --- by compiler 
				
				byte b = 12 ; 
				int i = b ; 
				//int y = (int)b ;  // explicitly --  by programmer  
				
				
				//  int --> byte   downcasting / type narrowing 
				
				int a = 20 ; 
				byte c = (byte) a ; 
				
				double d = 12.12 ; 
				int k = (int) d ; 
				//System.out.println(k);
				
				
				// boolean b = (boolean)10 ; 
				
				// char to int
	}

}
