package day22;

public class Task1 {

	public static void main(String[] args) {


		   String st="ABCAADKABb";
		   
		    
		    //TASK 1 : 
		    // loop through each character using subString 
		    // and print them out with - in between 
		    
		    // OPTIONALLY : avoid the dash in last character 
		

				for(int x=0; x<st.length(); x+=2) {
//					
//					if(x!=st.length()-1)
//					System.out.print(st.charAt(x)+"-");
//					else
//						System.out.print(st.charAt(x));

					
					String twoch=st.substring(x, x+2);

					System.out.print(twoch + ((x!=st.length()-1)? "-": "" ));
					
					
				}
				
	}

}
