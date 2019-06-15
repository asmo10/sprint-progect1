package repl.it;

import java.util.Arrays;

public class _135_2DArraysChessBoard {

	public static void main(String[] args) {

		  String[][] chessBoard = new String[8][8];
		    //WRITE YOUR CODE HERE
		    

		for (int r = 0; r < chessBoard.length; r++) {

			char ch = 97;

			for (int c = 0; c < chessBoard[r].length; c++) {
				chessBoard[r][c] = "" + (r + 1) + ch++;
			}
	
}		  
		  
		  
		    //DO NOT CHANGE
		    System.out.println(Arrays.deepToString(chessBoard));
		  }
		}
