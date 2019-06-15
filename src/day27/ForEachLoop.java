package day27;

public class ForEachLoop {

	public static void main(String[] args) {


		   int[] nums = {1,33,567,11,22} ; 
		    
		    for (int i = 0; i < nums.length; i++) {
		      
		      int eachItem = nums[i] ; 
		      System.out.println(eachItem);
		      
		    }
		    
		    // for each loop sytax 
		    /*
		     * for ( eachItemDataType variable name : collectionVariable ) {
		     *     your action in here
		     * }
		     * for each loop  or enhanced for loop  
		     * 
		     * for each loop can only be used for looping through collection type
		     * */
		    for( int eachItem  : nums ) {
		      System.out.println(eachItem);
		    }

		    
		    
		    //create String
		    String [] names = {"Alina", "Andrew"};
		    for  (String eachStr: names) {
		    	System.out.println(eachStr);
		    }
		    
		    
		    //create double
		    double [] dbl = {12.3, 15.8, 20};
		    for (double eachDbl : dbl) {
		    	System.out.println(eachDbl);
		    }




	}

}
