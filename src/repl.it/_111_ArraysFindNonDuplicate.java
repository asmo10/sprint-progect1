package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _111_ArraysFindNonDuplicate {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    //TODO: write your code below
	    Arrays.sort(nums);	
	     for (int i = 0; i <= nums.length-1; i+=2) {
		        		if(i==nums.length-1){
		        			System.out.println(nums[i]);
		        			break;
	     }
	     
		    		if(!(nums[i]==nums[i+1])) {
		    			System.out.println(nums[i]);
		    			break;
			}
		}
		}
	}
    	