package repl.it;

import java.util.Scanner;

public class _086_PrefixAgain {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
	    String pref="";
	    	for(int i=0; i<n; i++) {
	    		pref+=str.charAt(i)+"";
	    	}
	    	
	//    System.out.println(pref);
	    str=str.substring(n);
    	System.out.println(str.contains(pref));
	    }

}
