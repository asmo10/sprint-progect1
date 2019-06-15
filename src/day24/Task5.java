package day24;

public class Task5 {

	public static void main(String[] args) {

		
		char [] name= {'A','N','D','Y'};
		char[] name1= new char [4];
		name1[0]='A';
		name1[1]='N';
		name1[2]='D';
		name1[3]='Y';
		
		
		
		System.out.print(name1[0]);
		System.out.print(name1[1]);
		System.out.print(name1[2]);
		System.out.print(name1[3]);
	System.out.println();	
		for(int i=0; i<4; i++) {
			System.out.print(name1[i]);
		
		}
		System.out.println();
		for(int i=0; i<name1.length; i++) {
			System.out.print(name1[i]+" ");
		
		}
		
		
	}

}
