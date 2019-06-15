package day28;

import java.util.Arrays;

public class BinarySeach {

  public static void main(String[] args) {
    // 
    int[] nums =  {11,20,4,6,54,19,5} ; 
    
    Arrays.sort(nums);
    System.out.println( Arrays.toString(nums) );
    // ARRAY OBJECT MUST BE SORTED BEFORE USING THIS METHOD
    
    int index = Arrays.binarySearch(nums, 5) ;
    System.out.println(index);
  
  System.out.println(Arrays.binarySearch(nums, 11));
  
  }
}
