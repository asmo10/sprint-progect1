package repl.it;

import java.util.Scanner;

public class _094_CountHi {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		String str = scan.next();
		int t=0;
		String hi="";
		for(int i=0; i<str.length(); i++) {
			hi+=str.charAt(i)+"";
			if(hi.contains("hi")){
				t++;
				hi=hi.substring(hi.indexOf("hi")+1);
				System.out.println(t);
			}
					}
		System.out.println(t);
		
	}

}
