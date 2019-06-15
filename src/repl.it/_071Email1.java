package repl.it;

import java.util.Scanner;

public class _071Email1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String email = scan.next();

	    String fname, lname, end;
	    if(email.indexOf('_')==-1) System.out.println(email);

	    else {
	    fname=email.substring(0, email.indexOf('_'));
	    lname=email.substring((email.indexOf('_')+1), email.indexOf('@'));
	    end= email.substring(email.indexOf('@'));
	    System.out.println(lname+"_"+fname+end);
	   
	    }
	}

}
