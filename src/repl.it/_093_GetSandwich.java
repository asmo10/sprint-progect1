package repl.it;

import java.util.Scanner;

public class _093_GetSandwich {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		String str = scan.next();
		String j="";
		
		if(str.contains("bread")&& str.substring(str.indexOf("bread")+5).contains("bread")){
		
			j=str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
			System.out.println(j);}
		
			else System.out.println("nothing");
			
			
		
	}

}
