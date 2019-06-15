package officeHours;

import java.util.Scanner;

public class _102_SumDig {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String str = scan.next();
		    int sum  = 0;
		    //we are looping through the string
		    for(int i=0; i <str.length();i++){
		      //then we are checking if character is is digit
		      //Character - it's a class (wraper class for primitive char)
		      //isDigit() it's a method, that takes char, and it returns true
		      //if char is digit
		        if(Character.isDigit(str.charAt(i))){
		          //if it's digit, we can retrieve it as String 
		          //and we can convert it into digit
		          //but, we have to retrieve it as string
		          // Integer it's a wraper class for int primitive
		          // parseInt() method that can convert string into digit
		          // also use can use valueOf()
		            sum+=Integer.parseInt(str.substring(i,i+1));
		        }
		    }
		    System.out.println(sum);

	}

}
