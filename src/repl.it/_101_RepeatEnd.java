package repl.it;

import java.util.Scanner;

public class _101_RepeatEnd {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
			String str = scan.next();
			int n = scan.nextInt();
			String sum="";
			if(n<=str.length()) {
			for(int i=0; i<n; i++) {
				sum+=str.substring(str.length()-n, str.length());
			}
				
				System.out.println(sum);
			}
			
	}

}
