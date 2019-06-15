package repl.it;

public class _155_Methods_with_return_1_countAppearance {

	public static void main(String[] args) {

		
	}

	 
	  public int  count_appearance(String[] arr,String t)
	  {
		  int count=0;
		  for (int i = 0; i < arr.length; i++) {
			if(t.equals(arr[i]))
				count++;
				}
		return count;  
	   
	  } //end  count_appearance
	  

}