package day48;

public class Person {
	  private String name;
	  private int age;
	  private float height;
	  private char gender;
	  static int counter;
	  private static String cititizenship;

	  static {
	    //this is where value of cititizenship was updated.
	    cititizenship = "US";
	  }

	  public Person(String name, int age, float height, char gender) {
	    super();
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.gender = gender;
	    // whenever, new object get's created - counter will be increased.
	    // since constructor calls automatically, at the time when new object is
	    // created.
	    counter++;
	    System.out.println("New person created. Total count of people: " + counter);
	  }

	  public static String getCititizenship() {
	    return cititizenship;
	  }

	  @Override
	  public String toString() {
	    return "Person [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + "]";
	  }
	}
