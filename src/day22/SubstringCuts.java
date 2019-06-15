package day22;

public class SubstringCuts {

	public static void main(String[] args) {

	    // Task 2 
        //01234567890
//  String str = "ABCDEFGHIJK" ;
  
  // print 2 letter at a time compared to one from previous tasks
  // ABCDEFGH  --> AB CD EF GH 
  
//  for (int i = 0; i < str.length(); i+=2) {
//    
//    if(i!=str.length()-1)
//      System.out.print(  str.substring(i, i+2)  + " "  );
//    else
//      System.out.println(str.substring(i));
//  }
//  System.out.println();
//  
//  for (int i = 0; i < str.length(); i+=3) {
//    
//    if(i!=str.length()-2)
//      System.out.print(  str.substring(i, i+3)  + " "  );
//    else
//      System.out.println(str.substring(i));
//  }
  
  
//  System.out.print(  str.substring(0, 0+2)  + " "  );
//  System.out.print(  str.substring(2, 2+2)  + " "  );
//  System.out.print(  str.substring(4, 4+2)  + " "  );
//  System.out.print(  str.substring(6, 6+2)  + " "  );
//  System.out.print(  str.substring(8, 8+2)  + " "  );


 // Task 2 
        //0123456
//  String str1 = "ABCDEBC" ;
  
  // print 2 letter at a time compared to one from previous tasks
  // ABCDE  --> AB BC CD DE EB BC
  
  // Count the number of BC on this Sting 
//  int count = 0 ; 
//  
//  for (int i = 0; i < str1.length()-1; i++) {
//    
//    String twoChar =  str1.substring(i,i+2) ; 
//    System.out.println(twoChar);
//    if(twoChar.equals("BC") ){
//      count ++ ; 
//    }
//    
//  }
//  System.out.println(count);
//  System.out.println(str.substring(0,0+1) ); 
//  System.out.println(str.substring(1,1+1) ); 
//  System.out.println(str.substring(2,2+1) ); 
//  System.out.println(str.substring(3,3+1) ); 
//  System.out.println(str.substring(4,4+1) );

  // Task 2 
        //0123456
  String str1 = "javakavaava " ;
  
  // print 2 letter at a time compared to one from previous tasks
  // ABCDE  --> AB BC CD DE EB BC
  
  // Count the number of BC on this Sting 
  int count1 = 0 ; 
  int countOfChars = str1.length(); 
  String target = "ava" ; 
  int targetLength = target.length();
  
  for (int i = 0; i < str1.length()- targetLength+1 ; i++) {
  
    String word = str1.substring(i, i + target.length() );
    System.out.println(word);
    
    if (word.equals(target)) {
      ++count1;
    }

  }
  
  
//  for (int i = 0; i < str.length()-1; i++) {
//    
//    String twoChar =  str.substring(i,i+2) ; 
//    System.out.println(twoChar);
//    if(twoChar.equals("BC") ){
//      count ++ ; 
//    }
//    
//  }
  System.out.println(count1);
//  System.out.println(str.substring(0,0+1) ); 
//  System.out.println(str.substring(1,1+1) ); 
//  System.out.println(str.substring(2,2+1) ); 
//  System.out.println(str.substring(3,3+1) ); 
//  System.out.println(str.substring(4,4+1) ); 


	}

}
