package day10;

import java.util.Scanner;

public class GraderApp {

	public static void main(String[] args) {
	
		

			Scanner sc = new Scanner(System.in);
			System.out.println("enter your score");
			int score = sc.nextInt();

			if (score>100 || score<0) {
				System.out.println("Invalid number");
			}else if(score >= 90) { 
				System.out.println("you got A ");
			}else if (score >= 80) { 
				System.out.println("you gat B ");
			}else if (score >= 70) { 
				System.out.println("you got C");
			}else if(score < 70)
			System.out.println("study harder");
	}
	}

