package _200_OOP_5_Person_I;

public class Person {
//	Person class has following attributes: 
//
//		 - private String instance variables: firstName, lastName
//		 - private int instance variable: age

	private String firstName, lastName;
	private int age;

//
//		Methods:
//		  - getter and setter methods for each instance variable. try to use this. keyword
//		     -   toString method.No parameters and Returns(does not print! no println in the method!) person info in this format: "firstName | lastName | age"
//
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return firstName + " | " + lastName + " | " + age;
	}

//		Constructors:
//
//		1) No-Args constructor
//		 -sets default values for the Person object
//		 name and lastName => "undefined"
//		 age => -1
	public Person() {
		firstName="undefined";
		lastName="undefined";
		age=-1;
	}
	

//
//		2) 3-Args  Constructor:
//		 - accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
//		 try to use this. keyword
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person person = new Person("Fatima", "Lee", 22);
		System.out.println(person.toString()); 
	}
	
	
	
	
}