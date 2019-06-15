package repl.it;

public class _199_Methods_with_Arrays_3_switch_elements {

	public static int[] do_switch(int[] i) 
	 {

		int f=i[0];
		i[0]=i[i.length-1];
		i[i.length-1]=f;
		return i;
		}
	
	
}
