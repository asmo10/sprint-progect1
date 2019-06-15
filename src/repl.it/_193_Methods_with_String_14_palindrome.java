package repl.it;

public class _193_Methods_with_String_14_palindrome {

	public static boolean isPalindrome(String check) {

		check = check.replaceAll(" ", "").toLowerCase();
		boolean temp = false;
		for (int b = 0, e = check.length() - 1; b < check.length() && b < check.length()/ 2; b++, e--) {
			if (check.charAt(b) == check.charAt(e))
				temp = true;
			if (check.charAt(b) != check.charAt(e)) {
				temp = false;
				break;
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("No12 31on"));
	}
}
