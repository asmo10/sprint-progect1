package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _113_ArraysPrintFirstLastCharII {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		   
		    String[] newArr=new String[5];
		   
		    for (int i = 0; i < words.length; i++) {

				newArr[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
				
				
			}
		    System.out.print(Arrays.toString(newArr));
	}

}
