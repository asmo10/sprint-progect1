package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _133_Diving {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    float[] score = new float[7];
		    //WRITE YOUR CODE HERE
		   for (int f=0; f<score.length; f++) {
			   System.out.println("Enter score for judge " +(f+1)+":");
			   score[f]=input.nextFloat();	
			   } 
		   float total=0;
		   Arrays.sort(score);
		   float[] sc=Arrays.copyOfRange(score, 1, 6);
		   for (int i = 0; i < sc.length; i++) {
			  total+= sc[i];
			
		}
		   
		   System.out.println("Enter difficulty:");
		   double dif=input.nextDouble();
		   
		   total=(float) (total*dif*0.6);
		   
		    // FINAL OUTPUT
		    System.out.println("Total: "+total);
	}

}
