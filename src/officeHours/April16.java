package officeHours;

import java.util.Arrays;

public class April16 {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 1 };
//	    for(int i=0; i<inhabitants.length; i++) {
//	      inhabitants[i] = input.nextInt();
//	    }

		// TODO. Write you code below this line.
		int day = 0;
		int indexOfLastElement = inhabitants.length - 1;
		int totalPopulation = 0;
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		do {
			day++;
			for (int i = 0; i < inhabitants.length; i++) {
				if (i == 0) {
					if (inhabitants[1] == 0) {
						inhabitants[0] = inhabitants[0] / 2;
					}
				} else if (i == indexOfLastElement) {
					if (inhabitants[indexOfLastElement - 1] == 0) {
						inhabitants[indexOfLastElement] = inhabitants[indexOfLastElement] / 2;
					}
				} else {
					if (inhabitants[i + 1] == 0) {
						inhabitants[i] = inhabitants[i] / 2;
					} else if (inhabitants[i - 1] == 0) {
						inhabitants[i] = inhabitants[i] / 2;
					}

				}

			}
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			for (int i : inhabitants) {
				totalPopulation += i;
			}
			if (totalPopulation == 0) {
				break;
			}

			totalPopulation = 0;
		} while (true);

		System.out.println("---- EXTINCT ----");
	}
}