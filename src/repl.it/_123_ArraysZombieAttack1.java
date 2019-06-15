package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _123_ArraysZombieAttack1 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    int[] inhabitants = new int[8];
		    for(int i=0; i<inhabitants.length; i++) {
		      inhabitants[i] = input.nextInt();
		    }
		    //TODO. Write you code below this line. 
		    int cityzero=0, day=0;
		    System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));
		    while(cityzero<8) {
		    
		    for (int i = 0; i < inhabitants.length; i++) {
		    	inhabitants[i]/=2;
		    	if(inhabitants[i]==0)
		    	++cityzero;
		    	if(inhabitants[i]>0)
		    		cityzero=0;	
				if(i==inhabitants.length-1) {
					day++;
					System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));
				}
				}
		    }
		    System.out.println("---- EXTINCT ----");
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
