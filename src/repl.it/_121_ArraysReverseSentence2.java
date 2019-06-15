package repl.it;

import java.util.Scanner;

public class _121_ArraysReverseSentence2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here
		  String[] rev = sentence.split(" ");
			for (int i = rev.length - 1; i >= 0; i--) {
				if (i == 0)
					reversed += rev[i];
			else reversed += rev[i] + " ";
			}
		// End your code here. do not modify below statement
		System.out.println(reversed);

	}
}
