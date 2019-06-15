package repl.it;

import java.util.Scanner;

public class _031CaffeineOverdose {

	public static void main(String[] args) {


		int milligrams;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of milligrams in dring: ");
		milligrams= scan.nextInt();
		
		System.out.println("It would take about " +10000/milligrams+" drinks for a lethal overdose");
		

	}

}
