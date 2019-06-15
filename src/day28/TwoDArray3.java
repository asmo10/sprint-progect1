package day28;

public class TwoDArray3 {

	public static void main(String[] args) {
		    /*
		     * 2 dimensional array can be visualized as excel sheet 
		     *   which has rows and columns
		     *  first dimension size of 2d array can be seen as row count 
		     * second dimension size of 2d array can be seen as column count
		     * 
		     * 12 17 3 40 44 27 23 12
		     */
		    int[][] table = new int[4][2];
		    table[0][0] = 12;
		    table[0][1] = 17;
		    table[1][0] = 3;
		    table[1][1] = 40;
		    table[2][0] = 44;
		    table[2][1] = 27;
		    table[3][0] = 23;
		    table[3][1] = 12;
		    
//		    for(int[] row : table ) {
//		      
//		      for( int cell : row) {
//		        
//		        System.out.print( cell + " ");
//		        
//		      }
//		      System.out.println();
//		      
//		    }
		    
		    for (int i = 0; i < table.length; i++) {
		      
		       //int[] eachRow = table[i] ; 
		       //System.out.println( Arrays.toString(eachRow)  );
		       for(int j=0; j < table[i].length ; j++ ) {
		         System.out.print( table[i][j] + " ");
		       }
		       
		       System.out.println();
		    }
		    

		    // loop through this two D array to print out all the value 
		    
		    
		    
//		    int[][] data2 = new int[2][4];
//		    int[] data3[] = new int[3][2] ;  
//		    int data4[][] = new int[2][2] ; 



	}

}
