package repl.it;

import java.util.Scanner;

public class _084_Factorial {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		long num=scan.nextInt();
		long tot=1;
		String t="";
		for(long x=num; x>0; x-- ) {
			tot*=x;
			t+=x+"*";
		
		}
		System.out.println(tot);
		System.out.println(num+"!"+"="+t+"="+tot);

	}

}
