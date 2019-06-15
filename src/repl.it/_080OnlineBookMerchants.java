package repl.it;

import java.util.Scanner;

public class _080OnlineBookMerchants {

	public static void main(String[] args) {

	    int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();

	    if(isPremiumCustomer) 
	    	freeBooks=nbooksPurchased/8*2+nbooksPurchased%8/5;
	    else if(! isPremiumCustomer)
	    	freeBooks=nbooksPurchased/12*2+nbooksPurchased%12/7;	 
	    System.out.println(freeBooks);
	}

}
