package repl.it;

public class _166_Methods_with_String_2_unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 //test your code
    System.out.println( uniqueChars("wooden-spoon") ) ;
  }
  
  public static String uniqueChars(String str) {
    //TODO: write your below
    String uniq="";
    for (int i = 0; i < str.length(); i++) {
    	int count=0;
		for (int k = 0; k <uniq.length(); k++) {
			if(str.charAt(i)==uniq.charAt(k)) {
			count++;
			}
		}
		if(count==0)
		uniq+=str.charAt(i);
	}
    return uniq;
	  
  }
}
