package day27;

public class WarmUp {

	public static void main(String[] args) {

	    int[] num= {25,28,23,12,53,67};
	    // print true if all are numbers are more than 10
	    // print false if not
	    
	    // print false as long as one number are false 
	    
	    boolean result = true ; 
	    
	    for (int i = 0; i < num.length; i++) {
	      
	      if(num[i]<=10) {
	        result = false ; 
	        break;
	      }
	    }
//	      if(num[i]>10) {
//	        System.out.println("true");
//	      }else {
//	        System.out.println("false");
//	      }
	      
	    
	    System.out.println( result );




	}

}
