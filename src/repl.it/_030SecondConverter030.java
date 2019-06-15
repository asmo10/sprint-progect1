package repl.it;

import java.util.Scanner;

public class _030SecondConverter030 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int inputSeconds, hours, minutes, seconds;
		
		System.out.println("Enter seconds: ");
		inputSeconds = scan.nextInt();
				
		seconds = inputSeconds%60;
		minutes = inputSeconds/60%60;
		hours = inputSeconds/60/60;
		
		System.out.println(hours+" hours, "+minutes+" minutes, "+"and "+seconds+" seconds");
	}

}
