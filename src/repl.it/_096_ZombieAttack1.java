package repl.it;

import java.util.Scanner;

public class _096_ZombieAttack1 {

	public static void main(String[] args) {

		System.out.println("How many oh the inhabitans?");
		Scanner sc = new Scanner(System.in);
		int day = 0;
		int inhabitants = sc.nextInt();
		while (inhabitants > 0) {

			System.out.println("Day " + day + " [" + inhabitants + "]");
			inhabitants = inhabitants / 2;
			day++;
		}
		System.out.println("----EXTINCT----");
	}

}
