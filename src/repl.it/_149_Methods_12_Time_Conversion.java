package repl.it;

import java.util.Scanner;

public class _149_Methods_12_Time_Conversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		String amPm = s.substring(s.length() - 2, s.length());
		s = s.substring(0, s.length() - 2);
		String[] t = s.split(":");
		int h = Integer.parseInt(t[0]);
		if (amPm.equalsIgnoreCase("PM")) {
			h += 12;
			System.out.println(h + ":" + t[1] + ":" + t[2]);
			return;
		}
		System.out.println(t[0] + ":" + t[1] + ":" + t[2]);
	}
}
