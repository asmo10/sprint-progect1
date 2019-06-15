package day24;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {

		Random rand= new Random();
		int[] nums=new int[10];
		
		for (int j = 0; j <10; j++) {
			
			int i = rand.nextInt(100);	//0-99 random number
			System.out.print(i+ " ");

		
		
		}
		System.out.println();
	for (int j = 0; j <10; j++) {
			
			nums[j] = rand.nextInt(100);	//0-99 random number

		
	}
	System.out.print( Arrays.toString(nums));

}}
