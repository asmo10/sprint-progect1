package repl.it;

import java.util.Scanner;

public class _154_Methods_17_Fibonacci_numbers {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    fib(num);
		  }
		  
		  public static void fib(int num){
		    //WRITE YOUR CODE HERE
		   int total=0; 
		   int k1=0, k2=1;
			  for (int i = 1; i < num; i++) {
				  total=k1+k2;
				  k1=k2;
				  k2=total;
			
			}
			  System.out.println(total);
		  }
		}