
package day30;

public class MethodWithParameters {

	public static void main(String[] args) {

//    String s = "abc" ; 
//    System.out.println(s.substring(1,3));

//		printTheSum(10.5, 20.9);
//		printTheSum(123.9, 200.1);
//		printTheSum(11.33, 44.1);
//		printTheSum(11, 5);
		reportName("Andy","Smo");
		reverseString("Hello my dear, smart Andy. Wish you to lern java very succesfful!!!");

	}

	public static void printTheSum(double a, double b) {

		double sum = a + b;
		System.out.println("the sum of numbers is " + sum);

	}

	
	public static void reportName(String fName,String lName) {
		System.out.println("Your first and last name is "+fName+" "+lName);
		System.out.println(""+fName.charAt(0)+lName.charAt(0));
		
	}
	
	public static void reverseString(String rev) {
		String revnew="";
		for (int i = rev.length()-1; i >=0; i--) {
			revnew+=rev.charAt(i);
			
		}
		System.out.println(revnew);
		String[] revword=rev.split(" ");
		String revw="";
		for (int i = revword.length-1; i >=0; i--) {
			revw+=revword[i]+" ";
		}
		System.out.println(revw);
	}
}
