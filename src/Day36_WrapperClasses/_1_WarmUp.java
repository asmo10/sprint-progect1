package Day36_WrapperClasses;

public class _1_WarmUp {

	public static void main(String[] args) {
		
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean ("true");
		Boolean b2 = Boolean.valueOf(false);
		Boolean b3 = Boolean.valueOf("false");
					 //className.objectName
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		

		
		Integer s = new Integer (300);
		Integer s1 = new Integer ("300");
		Integer s2 = Integer.valueOf(300);
		Integer s3 = Integer.valueOf("300");
		

		System.out.println("equals?" + s.equals(300));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
