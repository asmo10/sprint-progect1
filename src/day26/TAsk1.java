package day26;

import java.util.Arrays;

public class TAsk1 {

	public static void main(String[] args) {

		String groceries="Acura, Honda, Nissan, Mitsubishi, Lincoln";
		String [] ar=groceries.split(",");
		System.out.println(Arrays.toString(ar));
		System.out.println(ar.length);
		int i=0;
		for(i=0; i<ar.length; i++)
		System.out.println(ar[i]+" length is "+ar[i].trim().length());
	}

}
