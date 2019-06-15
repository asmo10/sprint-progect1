package day54_evening;

public class Person {
	  private String name;
	  private int age;
	  private char gender;
	  // static not instance, we will not set this variable
	  // it will be increased any time we create an object.
	  private static int counter;
	  
	  public Person(String name, int age, char gender) {
	    this.name=name;
	    this.age=age;
	    this.gender=gender;
	    //once we will create an object, counter will be increased by one.
	    counter++;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public int getAge() {
	    return age;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }

	  public char getGender() {
	    return gender;
	  }

	  public void setGender(char gender) {
	    this.gender = gender;
	  }
	  //we need this method to check value of counter.
	  //get method usually stands for 
	  public static int getCounter() {
	    return counter;
	  }
	  
	  @Override
	  public String toString() {
	    return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	  }

	}


