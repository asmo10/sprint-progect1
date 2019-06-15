package repl.it;

import java.util.Scanner;

public class _048ConditionalOperator1 {

			public static void main(String[] args) {
	
				Scanner scan = new Scanner(System.in);
			    System.out.println("Enter number:");
					int x = scan.nextInt();
				int num;	
					num=(x>=5)? x:-x;
					System.out.println(num);
				
				
}}
