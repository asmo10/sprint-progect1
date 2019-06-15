package day34;

import java.util.Arrays;

public class Task2 {

	
	public static int[][] twoDPrintr(int a, int b){
		int [][] arr= new int[a][b];
		 for (int i = 0; i < a; i++) {
		      for (int j = 0; j < b; j++) {
				arr[i][j]=j+1;

		      }
	}
		 return arr;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		System.out.println(Arrays.deepToString(twoDPrintr(5, 5)));
	}

}
