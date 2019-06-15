package day35;

public class MethodOverloadingExamples {

	  public static void main(String[] args) {
	    
	    String name = "Java";
	    
	    System.out.println(  name.indexOf("a") );
	    System.out.println(  name.indexOf("a",2) );
	    
	    System.out.println(  name.replace('a', 'B')    );
	    System.out.println(  name.replace("va", "java")    );
	    
	    System.out.println(addNums(2,3));
	   System.out.println(addNums(2,3,2));
	    addNums(2, 3, 2, 5);;

	  }

	  public static int addNums(int a, int b) {
		  return a+b;
	  }
	  

	  public static int addNums(int a, int b, int c) {
		  return a+b+c;
	  }
	  

	  public static void addNums(int a, int b, int c, int d) {
		  System.out.println(a+b+c+d);
	  }
	  
	}


