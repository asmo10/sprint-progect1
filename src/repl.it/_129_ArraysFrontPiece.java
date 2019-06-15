package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _129_ArraysFrontPiece {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		//WRITE YOUR CODE HERE
		
		if(size>2)
			System.out.println(Arrays.toString(Arrays.copyOf(num, 2)));
	
		else 
			System.out.println(Arrays.toString(num));
		
		
		
		
		
		
		
		
	}

}
