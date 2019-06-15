package day22;

public class InClass4 {

	public static void main(String[] args) {

		//			  0123456789012
	    String str = "java kava ava " ;
	    
	    String target = "ava" ; 
	    
//	    int firstIndex = str.indexOf( target ); 
//	   System.out.println(firstIndex);
	    int laststIndex = str.lastIndexOf( target );
//	   System.out.println(laststIndex); 
	    int index = -1 ; 
	    
	    while( index<= laststIndex   ) {
	      
	      index = str.indexOf(target, index); 
	      System.out.println("Found at index : "+ index);
	      //index = index + 1 ; 
	      index = index + target.length() ; 
	      
	    }



	}

}
