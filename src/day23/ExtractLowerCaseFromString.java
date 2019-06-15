package day23;

public class ExtractLowerCaseFromString {

	public static void main(String[] args) {

	    String str = "5 Little Monkey Jumping on The Bed"; 
	    
//	    char eachChar = 'H' ; 
//	    System.out.println( eachChar >= 'a' );
//	    System.out.println( eachChar <= 'z' );
	//    
//	    if( eachChar >= 'a' && eachChar <= 'z')  {
//	      System.out.println("IT'S lowercase");
//	    }
//	    System.out.println("THE END");
	    
	    String allLowercaseStr = ""; 
	    for (int i = 0; i < str.length(); i++) {
	      /// storing each character inside variable each
	      // each iteration it will store that char 
	      char each = str.charAt(i); 
	      // checking whether this character at this iteration 
	      // is within the range of a-z
	      if( each >= 'a' && each <= 'z')  {
	        allLowercaseStr += each ;  // add on top of each other
	        //System.out.println("IT'S lowercase : " + each );
	      }
	    }
	    System.out.println( allLowercaseStr);

	}

}
