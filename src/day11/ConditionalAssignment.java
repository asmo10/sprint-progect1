package day11;

import java.util.Scanner;

public class ConditionalAssignment {

	public static void main(String[] args) {
				
		int score;
		String result, delivery;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your score");
		score = scan.nextInt();
		
		if (score>75) {
			result="pass";
			delivery="free delivery";

		}else {
			result="fail";
			delivery="$5 delivery";
		}
		
		System.out.println("result is: "+result+"\n"+delivery);
	}

}
