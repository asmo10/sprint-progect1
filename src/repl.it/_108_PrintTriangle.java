package repl.it;

import java.util.Scanner;

public class _108_PrintTriangle {

	public static void main(String[] args) {

		 int i = 1;
			int j = 1;
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			for (int k = 0; k < n; k++) {
				
				for(int y=0; y<=k; y++)
				System.out.print("*");
				
				System.out.println();
			}
			
	}

}
