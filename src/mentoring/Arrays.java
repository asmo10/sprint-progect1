package mentoring;

import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		
		
		//=================Arrays===============
		int[] nums=new int[3];//size is Immutable /not changeable
		nums[0]=1;
		nums[1]=2;
		nums[2]='a';//value of the a is 97
		nums[1]=nums[1]*5;//2*5=10
		//nums[4]=7;
		
		//System.out.println((nums[4]));
		//'a'char has its value from  table  
		String [] arr= {"a","b","3"};
		arr[2]=arr[2]+2;//it concatenate 2 to the arr[2] which is 3
//	
		
		System.out.println(Arrays.toString(arr));
		
		
		//===================ArrayList============
		//ArrayList size is mutable that means we can change size or value 
		
		ArrayList<Integer>numsList=new ArrayList<>(3);
		numsList.add(1);
		numsList.add(2);
		numsList.add(3);
		numsList.add(4);
		System.out.println("Before set method "+numsList);
		System.out.println(numsList.set(1, 5));
		System.out.println("After set Method "+numsList);
	
		
		//=============Array methods=========//=================ArrayList============
		//1)array.length						1)arrayLitr.size();
		//2)arr[i]="string"						2)arrayList.add();
		//nums[i]=3;
		//3)Arrays.toString						3)arrayList.get();
		//4)array.contains()					4)arrayList.contains()
		//										5)arrayList.clear();
		//										6)arrayList.equals()
		//										7)arrayList.set(0, 5);
		//										8)arrayList.remove(3);


}}