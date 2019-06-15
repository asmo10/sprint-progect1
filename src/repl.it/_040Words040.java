package repl.it;

import java.util.Scanner;

public class _040Words040 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    String word1 = s.next();
	    String word2 = s.next();
	    
	    if(word1.equals(word2)) {
	    	System.out.println(word1+" equals "+word2);
	    }else if(!word1.equals(word2)) {
	    	System.out.println(word1+" does not equals "+word2);
	    }

	}

}
