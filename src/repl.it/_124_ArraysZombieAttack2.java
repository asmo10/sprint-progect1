package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _124_ArraysZombieAttack2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		
		//Office hours 15_04 and 16_04 explaining
		
		
		// TODO. Write you code below this line.
		int cityzero =1, day = 0;
		boolean[] wasdev=new boolean[inhabitants.length];
		wasdev[inhabitants.length]=false;
		int[] inhabitantsZ = inhabitants;
		System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
		while (cityzero > 0) {
			for (int i = 0; i < inhabitants.length; i++) {
				cityzero += inhabitants[i];
			}
			for (int i = 0; i < inhabitants.length; i++) {
				if (inhabitants[i] == 0 && i != 0 && !(i == inhabitants.length - 1)) {
					if(wasdev[i - 1]=false) {
					inhabitantsZ[i - 1] /= 2;
					wasdev[i - 1]=true;
					}
					if(wasdev[i + 1]=false) {
					inhabitantsZ[i + 1] /= 2;
					wasdev[i + 1]=true;
					}
					i++;
				}
				if (inhabitants[i] == 0 && i == 0)
					inhabitantsZ[i + 1] /= 2;
				if (inhabitants[i] == 0 && i == (inhabitants.length - 1))
					inhabitantsZ[i - 1] /= 2;
				cityzero=0;
			}
			for (int i = 0; i < inhabitants.length; i++) {
				cityzero += inhabitants[i];
			}
			System.out.println("Day " + day++ + " " + Arrays.toString(inhabitantsZ));
		}

		System.out.println("---- EXTINCT ----");
	}

}
