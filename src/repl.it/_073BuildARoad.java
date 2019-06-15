package repl.it;

import java.util.Scanner;

public class _073BuildARoad {

	public static void main(String[] args) {

	     Scanner scan = new Scanner(System.in);
	     String start = scan.next();
	     String end = scan.next();

	     String A,B,C,D, f;
	     A="right";
	     B="down";
	     C="left";
	     D="up";
	     f=" found";
	     
	     if(start.equals(end)) System.out.println(start+f);
	     else if(start.equals("A")) {
	    	 if(end.equals("B")) System.out.println(A+": B"+f);
	    	 else if(end.equals("C")) System.out.println(A+" > "+B+": C"+f);
	    	 else if(end.equals("D")) System.out.println(A+" > "+B+" > "+C+": D"+f);
	     }
	     else if(start.equals("B")) {
	    	 if(end.equals("C")) System.out.println(B+": C"+f);
	    	 else if(end.equals("D")) System.out.println(B+" > "+C+": D"+f);
	    	 else if(end.equals("A")) System.out.println(B+" > "+C+" > "+D+": A"+f);
	     }else if(start.equals("C")) {
	    	 if(end.equals("D")) System.out.println(C+": D"+f);
	    	 else if(end.equals("A")) System.out.println(C+" > "+D+": A"+f);
	    	 else if(end.equals("B")) System.out.println(C+" > "+D+" > "+A+": B"+f);
	     }else if(start.equals("D")) {
	    	 if(end.equals("A")) System.out.println(D+": A"+f);
	    	 else if(end.equals("B")) System.out.println(D+" > "+A+": B"+f);
	    	 else if(end.equals("C")) System.out.println(D+" > "+A+" > "+B+": C"+f);
	     } 
	     
	     
	     
	}

}
