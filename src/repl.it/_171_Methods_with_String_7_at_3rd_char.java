package repl.it;

public class _171_Methods_with_String_7_at_3rd_char {

	
	
	 public static String at3(String target,String word)
	  {
	    String f=target.substring(0,3);
	    String th=target.substring(3);
		 return f+word+th;
		 
	  }
	 
	 
	 public static void main(String[] args) {
		System.out.println(at3("longword","foo"));
	}
}
