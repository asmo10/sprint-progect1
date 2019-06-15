package mentoring;

	import java.util.Arrays;
	import java.util.Scanner;

public class replIt_124_Zombie {

	

		 public static void main(String[] args) {
		//	 int[] inhabitants = {3,6,0,4,3,2,7,0};
		 int[] inhabitants = {10,0,20,4,0,1,6,0};
		//TODO. Write you code below this line.
			 
			 int day =0;
			 int sum =0;
			 int checkZero = 0;
			 boolean [] isDivided = new boolean [inhabitants.length];     //to assign true value to the element if divided, so that it will not be divided second time
			 
			 do {                                                                //to assign true value to the element if divided, so that it will not be divided second time
				 System.out.println("Day "+day+" " + Arrays.toString(inhabitants) );  //zero day print out
				 			 
				 for (int idx=0; idx<inhabitants.length; idx++) {      //to divide each element
					  
					 if( idx==0 && inhabitants [idx]==0) {            //checking value of element and position idx=0
						 checkZero = inhabitants [idx+1];             //chechZero assigned to next element which is going to be divided
						 inhabitants [idx+1]/=2;                      //divide neighbor of zero
						 isDivided [idx+1] =true;                     //then assign that element as true, divided
						 if (inhabitants [idx+1]==0  && checkZero>0) {idx++;} //it means if after division neighbor element becomes zero do not consider it next time, otherwise as it is zero it tries to divide next one, but
					 }
					 
					 else if (idx == inhabitants.length-1  && inhabitants [idx]==0) { //idx=inhabitants.length-1
						 if (isDivided [idx-1]==false) {                              //checking whether idx-1 was assigned as true/divided, if true it will not divide, otherwise will divide
							inhabitants [idx-1]/=2; 
						 }
					 }
					 
					 else if (inhabitants [idx]==0) {                               // 1<=idx<=inhabitants.length-1, after here conditions for idx=0 and idx=inhabitants.length-1 will be combined
						 if (isDivided [idx-1]==false) {
						   inhabitants [idx-1]/=2;
						 }
						 
						 checkZero = inhabitants [idx+1];
						 inhabitants [idx+1]/=2;
						 isDivided [idx+1] =true;
						 if (inhabitants [idx+1]==0  && checkZero>0) {idx++;}      //skip coming
					}
				 }//end of for loop

				 sum = 0;                                                         //before starting for loop sum made zero, so after division we could check sum again, 
				 for (int idx=0; idx<inhabitants.length; idx++) {                 //find sum of each element after each loop
					 sum += inhabitants [idx]; 
				 }
				 
				 
				 day++;                                                          //increase day end of the do while loop
				 
				 if (sum == 0) {                                                 //if condition, to print array when all zero
					 System.out.println("Day "+day+" "+ Arrays.toString(inhabitants) ); 
				 }
				 
			 }while (sum !=0) ;                                                  // stop when sum == 0;
				 
		 }
	}



