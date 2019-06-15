package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class _148_Methods_11_add_to_array {

	  public static void add_to_r(int[] r,int n) 
		{

		  int[] arrN=new int[r.length+1];
		  arrN=Arrays.copyOf(r, r.length+1);
				  arrN[arrN.length-1]=n;
		  System.out.println(Arrays.toString(arrN));
			
		}
	  
	  public static void main(String[] args) {
	    
	    
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt(),n = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	     add_to_r(arr, n);
	   
	    
	  }
	}