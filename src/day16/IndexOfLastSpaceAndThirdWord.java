package day16;

public class IndexOfLastSpaceAndThirdWord {

	public static void main(String[] args) {

		String st="Sunday is Java Day";
		st=st.toUpperCase();
		
		System.out.println(st);
		System.out.println(""+st.charAt(st.length()-2)+st.charAt(st.length()-1));
		System.out.println(st.substring((st.length()-2),(st.length())));
		System.out.println(st.indexOf("IS "));
		System.out.println(st.contains("JAVA"));
		System.out.println(st.indexOf("JAVA"));
		
		int space1=st.indexOf(" ");
		int space2=st.indexOf(" ",(space1+1));
		int space3=st.indexOf(" ",(space2+1));
		
		System.out.println("Index of third word is: "+(space2+1));
		String word3=st.substring(space2, space3);
		System.out.println("Third word is: "+word3);
		int lastspase=st.lastIndexOf(" ");
		System.out.println("Index of last spase is: "+lastspase);
		
		
	}

}
