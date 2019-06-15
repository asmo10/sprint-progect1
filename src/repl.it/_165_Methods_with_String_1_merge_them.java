package repl.it;

public class _165_Methods_with_String_1_merge_them {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(mergeStrings("alina","andy289"));
	}

	 public static String mergeStrings(String one, String two) {
		   
		 String mstr="";
		 for (int i = 0, k=0; i < one.length() || k<two.length(); i++, k++) {
			 if(i<one.length())
			 mstr+=one.charAt(i);
			 if(k<two.length())
				mstr+=two.charAt(k);
				
			}
		 return mstr;
			 
		}
		    
		    
	  }

