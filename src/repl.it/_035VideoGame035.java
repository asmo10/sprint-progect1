package repl.it;

import java.util.Scanner;

public class _035VideoGame035 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		int c = scan.nextInt();
		
		
		System.out.println("Number of Candies: "+c/10 
				+"\n* * * * * * * * * * * * * * * * \n"
				+"Number of Gumballs: "+c%10/3
				+"\n* * * * * * * * * * * * * * * * \n"
				+"Your remaining coupon's balanse is: "+c%10%3
				+"\n-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
			}

}
