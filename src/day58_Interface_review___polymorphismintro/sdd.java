package day58_Interface_review___polymorphismintro;

import java.util.Scanner;

public class sdd {
	
		public static void main(String[] args) {
			


/**
* Reverses the order of the elements in the specified array
	 * @param arr
	 * @return array of strings
	 */
public static String[] reverse(String[] arr) {
	String arr2;	
	for (int i = 0; i < arr.length/2; i++) {
		 arr2 = arr[i];	
		arr[i] =  arr[arr.length-1 - i];
		arr[arr.length-1 - i] =arr2;
	}
	
		return arr;
	}
}
	
