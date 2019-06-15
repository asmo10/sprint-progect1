package repl.it;

import java.util.Arrays;

public class _142_Methods_5_simple_print_pattern {

	public static void printHollowRect() {
		
		for (int i = 0; i < 5; i++) {
			if(i==0 || i==4)
				System.out.println("*****");
			if(i>0 && i<4)
				System.out.println("*   *");
			
		}
			
		
	}

	public static void main(String[] args) {

		printHollowRect();
	}

}