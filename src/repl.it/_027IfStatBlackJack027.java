package repl.it;

import java.util.Scanner;

public class _027IfStatBlackJack027 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	    
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    
	    if(player>21) {
	    	System.out.println("burst");
	    }else if(house>player) {
	    	System.out.println("loses");
	    }else if(player==house) {
	    	System.out.println("drow");
	    }else if(player>house) {
	    	System.out.println("wins");
	    }
	}

}
