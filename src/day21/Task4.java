package day21;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("print your name");
		String n=sc.next();
		int len=n.length();
		for(int i=0; i<len; i++) {
			System.out.print(n.charAt(i)+" ");
		}
//		System.out.println();
//		System.out.println("print your name");
//		String n2=sc.next();
//		len-=1;
//		for(int i=0; len>=0; len--) {
//			System.out.print(n2.charAt(len)+" ");
//		}
		System.out.println();
		System.out.println("print your name");
		String n3=sc.next();
//		
//		for(int d=n3.length()-1; d>=0; d--) {
//			System.out.print(n3.charAt(d)+" ");
//			
//		}
		
		String newStr="";
		for(int d=n3.length()-1; d>=0; d--) {
			System.out.print(n3.charAt(d)+" ");
			newStr=newStr+n3.charAt(d);
		}
		System.out.println();
		System.out.println("***************");
		System.out.println(newStr);
	}
	

}
