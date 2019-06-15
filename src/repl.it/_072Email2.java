package repl.it;

import java.util.Scanner;


public class _072Email2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String email = scan.next();

	    String fname, lname, dom, tdom;
	 //   if(email.indexOf('_')==-1) System.out.println(email);

	   // else {
	    fname=email.substring(0, (email.indexOf('_')));
	    lname=email.substring((email.indexOf('_')+1), (email.indexOf('@')));
	    dom= email.substring((email.indexOf('@')+1), email.indexOf('.'));
	    tdom=email.substring((email.indexOf('.')+1));
	  
	    String fn=fname.substring(0, 1).toUpperCase();
	    fname=fn+fname.substring(1);
	    
	    String ln=lname.substring(0, 1).toUpperCase();
	    lname=ln+lname.substring(1);
	   	  
		System.out.println("First name: "+fname);
		System.out.println("Last name: "+lname);
		System.out.println("Domain: "+dom);
		System.out.println("Top-Level Domain: "+tdom);
	    
					   
	
	   
	    }

}


