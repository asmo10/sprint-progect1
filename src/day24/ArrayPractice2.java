package day24;

public class ArrayPractice2 {

	public static void main(String[] args) {

	
	    // create an int array of 5 items and assign values ; 
	    //{1,4,6,8,9}
	    int nums []= {1,4,6,8,9};
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    System.out.println();
	    // double the value of 3rd item  : for example 6 --> 12 
	    nums[2] = nums[2] * 2 ; 
	    // update the value of 4th item to sum of 1st and 2nd items  8 --> 1+4
	    nums[3] = nums[0] + nums[1] ; 
	    
	    for (int i = 0; i < nums.length; i++) {
	      System.out.print( nums[i] + " ");
	    }
	    

//++++++++++++++++++++++++++++++
		
		
		
		int[] num= {1,4,6,8,9};
		
		num[2]=num[2]*2;
		num[3]=num[0]+num[1];
		System.out.println();
		for(int i=0; i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println();
		int ns=num[0];
		num[0]=num[num.length-1];
		num[num.length-1]=ns;
		
		for(int i=0; i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		
		
	}

}
