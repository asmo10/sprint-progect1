package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _136_ArraysShift_Left {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i = 0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    //WRITE YOUR CODE HERE
		    
		    int[] temp= new int[1];
		   temp[0]=nums[0];
		  for (int i = 0; i <nums.length-1; i++) {
			nums[i]=nums[i+1];
		}  
		    nums[size-1]=temp[0];
		    
		    System.out.println(Arrays.toString(nums));
		    
	}

}
