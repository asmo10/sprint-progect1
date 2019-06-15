package repl.it;

import java.util.Scanner;

public class _090_ParseHTML {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		String html=scan.nextLine();
		
		
		if(html.indexOf("id=")==-1)
			System.out.println("Invalid input!");
		else{
		html=html.substring(html.indexOf("id=")+3);
		html=html.substring((html.indexOf('"')+1),html.lastIndexOf('"'));
		System.out.println(html);
		
		}
		
	}

}
