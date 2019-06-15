package day19;

import java.util.Scanner;

public class inClass3 {

	public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

		    String str = scan.next();
		    // how to check whether string start with a-z
		    char firstChar = str.charAt(0);

		    //ABC System.out.println('a' > 'b');

		    if (firstChar >= 'a' && firstChar <= 'z') {

		      System.out.println(" lower case letter");

		    } else {

		      System.out.println("NOT a-z");
		    }

		  }

		




	}
