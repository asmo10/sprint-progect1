package day24;

public class Task3 {

	public static void main(String[] args) {

		// WARM UP TASKS
		/*
		 * 3, Print A-Z 26 times in 26 rows NOW : Modify the code to print as below A AB
		 * ABC ABCD ABCDE ... ... ALL THE WAY TILL Z
		 */
//for (int i = 1; i <= 26; i++) {
//for (int i = 65; i <= 91; i++) {
		for (int i = 'A'; i <= 'Z'; i++) {

			for (int c = 'A'; c <= i; c++) {
				System.out.print((char) c + " ");
			}
			System.out.println();

		}

//for (int c = 'A'; c <= 'A'; c++) {
//  System.out.print( (char)c + " ");
//}
//System.out.println();
//
//for (int c = 'A'; c <= 'B'; c++) {
//  System.out.print( (char)c + " ");
//}
//System.out.println();
//
//for (int c = 'A'; c <= 'C'; c++) {
//  System.out.print( (char)c + " ");
//}
//System.out.println();

	}

}
