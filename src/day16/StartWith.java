package day16;

import java.util.Scanner;

public class StartWith {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String st=sc.next();
		//1st option
		//boolean bool1=st.startsWith("A")
		//System.out.println("name starts with A: "+bool1);	
		//or
		System.out.println("name starts with A: "+st.startsWith("A"));

		System.out.println("end with x: "+st.endsWith("x"));
		
		System.out.println("Index of \"a\" : "+st.lastIndexOf("a"));
		int midlength=st.length()/2;
		if(st.length()%2==0) {
			char midL = st.charAt(midlength-1);
			char midR = st.charAt(midlength);
			System.out.println(""+midL+midR);}
		else if((st.length()%2!=0)) System.out.println(st.charAt(midlength));
	
	
	}

}
