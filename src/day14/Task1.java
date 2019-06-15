package day14;

public class Task1 {

	public static void main(String[] args) {

		String n= "Andrey";
		System.out.println(n.charAt(5));
		int count=n.length();								//2nd option
		System.out.println(n.substring(count-1,count));		//
		System.out.println(n.substring(0,2));
		int midPoint=count/2;								//2nd option
		System.out.println(midPoint);						//
		System.out.println(n.substring(3,6));
		System.out.println(n.substring(midPoint,count));   //
		
	}

}
