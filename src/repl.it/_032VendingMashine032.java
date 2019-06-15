package repl.it;

import java.util.Scanner;

public class _032VendingMashine032 {

	public static void main(String[] args) {


		int itemPrice, quarters, dimes, nickels;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price in cents:");
		
		itemPrice = scan.nextInt();
		
		if(itemPrice<25 || itemPrice>100) {
			System.out.println("Invalid price!");
			}else if(itemPrice%5!=0) {
			System.out.println("Invalid price!");	
			}else{
				System.out.println("Your change is "+(100-itemPrice)/25+" quarters"+", "
						+ ""+(100-itemPrice)%25/10+" dimes, and "+(100-itemPrice)%25%10/5+" nickels.");
			}
	}
}

