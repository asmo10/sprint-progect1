package mentoring;

import java.util.*;
public class Palindrome {

	
		  public static void main(String[] args) {

		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		    
		  // int length = String.valueOf(num).length();
		  }
		  
		   public static void isPalindrome(int num){
			    //WRITE YOUR CODE HERE
			    
			// FINDING NUMBER OF DIGITS PART  
			  int length=0;  // number of digits
			  int numCopy = num; 
			  
			  for (int i=1; i<=10; i++){
			    if(numCopy -((numCopy/10)*10)>0){
			      length++;
			      numCopy /=10;
			    }
			  } 
			   // CREATE AN ARRAY WITH SPECIDIC DIGITS 
			   
			   int [] arr = new int[length];
			   for(int m = length-1; m>=0 ; m--){
			     arr[m]= num-((num/10)*10);
			     num /=10;
			   }
			   
			   //CoMPARING PART
			   
			   boolean same =true;
			   
			   int n = length;
			   for(int j=0; j<length/2; j++){
			     n--;
			     if(arr[j] != arr[n]){
			       same = false;
			       System.out.println(same);
			       System.exit(0);
			     }
			     
			   }
			   System.out.println(same);


				}
			}

	