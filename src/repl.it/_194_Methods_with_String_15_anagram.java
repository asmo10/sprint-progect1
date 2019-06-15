package repl.it;

import java.util.Arrays;

import day26.ToCharArrayPractice;

public class _194_Methods_with_String_15_anagram {

	 public static boolean isAnagram(String word1, String word2) {
		char[] arr1=word1.replaceAll(" " , "").toLowerCase().toCharArray();
		 char[] arr2=word2.replaceAll(" " , "").toLowerCase().toCharArray();
//		if(word1.length()!=word2.length()) return false; 
//		 for (int a = 0; a < word1.length(); a++) {
//			if (!(word2.contains(word1.charAt(a)+""))) 
//				return false;
//			}
//		 return true;
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 return Arrays.equals(arr1, arr2);
	  }

}
