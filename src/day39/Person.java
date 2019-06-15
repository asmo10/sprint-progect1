package day39;

public class Person {
	// properties| attributes of 
	// the object are defined
	// by instance variable/field
	String name;
	int age;
	char gender;
	
	//public static void eat() {
	// any non-static method is called instance method 
	public void eat() {
		
		System.out.println(" eating ");
		
	}
	
	public void tellMeYourName() {
		System.out.println("My Name is " + name);
	}
	
	public void printPersonInfo() {
		System.out.println("My Name is :  " + name  
						+ "| my age is : " + age 
						+ "| my gender is " + gender ) ; 
				
	}
	

	
}
