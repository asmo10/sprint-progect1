package _203_Methods_with_Arrays_4_populate_array;

import java.util.Arrays;

public class main {
	public static int[] populate(int[] r) 
	{
		for (int i = 0; i < r.length; i++) {
			r[i]=i+1;
		}
		return r;
		
		
	}
	
	public static void main(String[] args) 
	{
	 
	  
    int [] i= new int[3]; 
    i= populate(i) ;
    System.out.println(Arrays.toString(i));

	}
}
