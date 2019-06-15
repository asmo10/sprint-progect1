package repl.it;

public class _167_Methods_with_String_3_cover {

public static void main(String[] args) {
	 
	System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
	    
	   
		  
		  if (main.contains(coverME)) {
	            return main.replaceAll(coverME, "[" + coverME + "]");
	        } else {
	            return "[" + main + "]";
	        }}}
	  
		  
		  
		//the code below doesnt work properly  



//	    	return main="["+main+"]";
//	    String tempStr="";
//	    for (int i = 0; i < main.length(); i++) {
//			if(i<(main.length()-coverME.length()) && (main.substring(i, i+coverME.length()).contains(coverME))) {
//			tempStr+="[" + main.substring(i, i+coverME.length()) + "]";
//			i=i+coverME.length()-1;
//	    }else tempStr+=main.charAt(i);
//			
//		}
//	    return tempStr;
//	  }
//	  
//	}
	
	
