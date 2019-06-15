package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _128_ArraysMakeLast {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
				for(int i =0; i < size; i++) {
					nums[i] = scan.nextInt();
				}
				//WRITE YOUR CODE HERE
				int num2=nums[nums.length-1];
				int[] nArr=new int[size*2];
				nArr[size*2-1]=num2;
				System.out.println(Arrays.toString(nArr));
	}

}
