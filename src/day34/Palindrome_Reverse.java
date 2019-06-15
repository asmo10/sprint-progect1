package day34;

public class Palindrome_Reverse{

	public static void main(String[] args) {

		
		System.out.println(palindromeCheck("anna"));
	}

	public static boolean palindromeCheck(String str) {
		String reverseStr = "";
		str=str.replaceAll(" ", "");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			reverseStr += str.charAt(i);

		}
		System.out.println();
		return reverseStr.equals(str);
	}
	
	public static String revereString(String str) {
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
			reverseStr += str.charAt(i);
		}
		
	return reverseStr;
}}
