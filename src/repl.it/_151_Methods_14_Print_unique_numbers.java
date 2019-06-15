package repl.it;

import java.util.Scanner;

public class _151_Methods_14_Print_unique_numbers {
	
	
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
	  }
		  
		  public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
		    boolean uniknum=false;
		   for (int i = 0; i < nums.length; i++) {
		for (int k = 0; k < nums.length; k++) {
			if(nums[i]==nums[k] && i!=k) {
				uniknum=false;
				break;
			}else {uniknum=true;	
			}
			
		}
		if(uniknum) System.out.println(nums[i]);
		}}}
		   
		
		  
