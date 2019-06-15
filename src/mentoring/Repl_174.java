package mentoring;

import java.util.Scanner;

public class Repl_174 {

	//1.	Complete the minValue method so that given the array nums, it will return the minimum value in the array.
	
	//2.	Complete the maxValue method so that given the array nums, it will return the maximum value in the array.
		
	//3.    Complete the maxLength method so that given the array words, it will return the word with the largest length.
		
		public static void main(String[] args) 
		{
			int[] arr = {5,12,-3,7,3,22};
			
			System.out.println(minValue(arr)); //should print  -3
			
			System.out.println(maxValue(arr)); //should print  22
			
			String[] arr1 = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr1)); //should print "this is long"
			
	//4.	(Reverse an array) The reverse method in Section 7.7 reverses an array by copying it to a new array. 
//			Rewrite the method that reverses the array passed in the argument and returns this array. 
//			Write a test program that prompts the user to
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter 10 integers: ");
		    
			int[] myList = new int[10];
		    for (int i = 0; i < myList.length; i++) {
		    myList[i] = input.nextInt();
		    }//10 21 33 25 109 67 3 44 50 28
		    
		    reverse(myList);

		    for (int i = 0; i < myList.length; i++) {
		    System.out.print(myList[i] + " ");
		    }
			
			
	//5.	(Locate the largest element) Write a method that returns the location of the largest element in a two-dimensional array.
//			The return value is a one-dimensional array that contains two elements. 
//			These two elements indicate the row and column indices of the largest element in the two-dimensional array. 
//			Write a test program that prompts the user to enter a two- dimensional array and displays 
//			the location of the largest element in the array.
			
			System.out.println("Enter the number of rows and columns: ");
			int numberOfRows = input.nextInt();
			int numberOfColumns = input.nextInt();

			double[][] arr3 = new double[numberOfRows][numberOfColumns];
			
			System.out.println("Enter the array: ");
			for(int i=0; i<arr3.length;i++) {
				for(int j=0; j<arr3[i].length; j++) {
					arr3[i][j]=input.nextDouble();
				}
			}
			
			int[] location = locateLargest(arr3);
			System.out.println("The location of largest element is at ("+ location[0]+
					", "+location[1]+")");
			}
		
		public static String maxLength(String[] words)
		{int maxL=words[0].length();
		String maxW="";
		for(int i=0; i<words.length; i++) {
			if(maxL<words[i].length()) {
				maxW=words[i];
			}
		}
			
		return maxW;
		}
		
		public static int minValue(int[] nums)
		{int min = nums[0];
		for(int i=0; i< nums.length; i++) {
			if(nums[i]<min)
				min=nums[i];
		}	
		return min;	
		}
		
		public static int maxValue(int[] nums)
		{int max = nums[0];
		for(int i=0; i< nums.length; i++) {
			if(nums[i]>max)
				max=nums[i];
		}	
		return max;	
		}
		
		
		public static int[] reverse(int[] list) {//[0], [1],[3],[4],[5],
		
			for(int i=0, j=list.length-1; i<list.length/2;i++,j-- ) {
				int temp = list[i];
				list[i]=list[j];
				list[j]=temp;
			}
			return list;
			
		}
		
		public static int[] locateLargest(double[][] arr) {
			int location[]= new int[2];
			double largest = arr[0][0];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					if(largest<arr[i][j]) {
						largest=arr[i][j];
						location[0]=i;
						location[1]=j;
					}
				}
			}
			return location;

}}