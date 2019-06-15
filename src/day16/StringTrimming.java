package day16;

public class StringTrimming {

	public static void main(String[] args) {

		String str="    GO   JAVA SPARTAN     ";
		//str=str.trim();
		int j=str.indexOf("J");
		int n=str.indexOf("N");
		String jav=str.substring(j, n+1);
		System.out.println(jav);
	}

}
