package day9;

import java.util.Scanner;

public class MultiBranchIfStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your score");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("you got a ");
		} else if (score >= 80 && score < 90) {
			System.out.println("you gat b ");
		} else if (score >= 70 && score < 80) {
			System.out.println("you got c");
		} else {
			System.out.println("study harder");

		}
	}

}
