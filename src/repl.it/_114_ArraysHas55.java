package repl.it;

import java.util.Scanner;

public class _114_ArraysHas55 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		// TODO Type your code below:
		int t = 0, f = 0;

		for (int i = 0; i < nums.length-1; i++) {
			if (!(nums[i] == 5)) f=1;
			if (nums[i] == 5 && nums[i+1] == 5) {
				t = 1;
				f=0;
				break;
			}
		}
		if (f == 1)
			System.out.println("false");
		if (t == 1)
			System.out.println("true");

	}
}
