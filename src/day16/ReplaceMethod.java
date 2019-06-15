package day16;

public class ReplaceMethod {

	public static void main(String[] args) {

		
		String str="Date is 03_25_2019";
		System.out.println(str);
		str=str.replace("_","-");
		System.out.println(str);
		str=str.replace("is","will be");
		System.out.println(str);
	}

}
