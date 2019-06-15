package day24;

public class GetTheSum {

	public static void main(String[] args) {

		// print them out using the loop
		// get the sum of all numbers

		int nums[] = { 1, 4, 6, 8, 9 };

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
			sum += nums[i];
		}
		System.out.println();
		System.out.println("sum is: " + sum);

//		    int sum = 0 ; 
//		    for (int i = 0; i < nums.length; i++) {
//		      
//		      sum = sum + nums[i] ; 
//		      
//		    }
//		    int j = 0 ; 
//		    do {
//		      sum = sum + nums[j] ; 
//		      j++ ; 
//		    } while (j<nums.length);
		//

		int sum1=0;
		int z = 0;
		while (z < nums.length) {
			sum1 = sum1 + nums[z];
			z++;
		}

		System.out.println(sum1);

	}

}
