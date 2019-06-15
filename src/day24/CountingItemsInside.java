package day24;

import java.util.Arrays;

public class CountingItemsInside {

	public static void main(String[] args) {

	    
	    // TASK : 
	    
	    int[] nums = {1,55,7,898,9,55} ; 
	    
	    // find the count of numbers more than 100 ; 
	  int sum=0;
	    for(int i=0; i<nums.length; i++) {
	    	if(nums[i]>100)sum++;
	    	
	    }
	    
	    System.out.println(sum);
//	    print out whats in nums
	    System.out.println( Arrays.toString(nums));


	}

}
