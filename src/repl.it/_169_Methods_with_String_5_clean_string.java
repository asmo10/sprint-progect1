package repl.it;

public class _169_Methods_with_String_5_clean_string {

	 public static String clean (String text ,String badWord) {

	  return text.replaceAll(badWord, " ");
	      
	  }
	 
	 public static void main(String[] args) {
		
		 System.out.println(clean("he said bla bla bla","bla"));
	}
	}