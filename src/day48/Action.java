package day48;

public class Action {
	  public static void main(String[] args) {
	    // whenever we need to access static members
	    // we use Class.static member
	    // we are accessing static variable counter through the class name

	    System.out.println("Count of people that where generated: " + Person.counter);

	    Person person1 = new Person("Emine", 27, 5.5f, 'F');
	    Person person2 = new Person("Myensulu", 34, 5.5f, 'F');

	    // in this case, we are accessing static variable counter through the object
	    // person2
	    System.out.println(person1);
	    System.out.println("*******************");
	    System.out.println("Count from person1: " + person1.counter);
	    System.out.println("Count from person2: " + person2.counter);
	    System.out.println("Count from Person class: " + Person.counter);
	    // static field counter is a shared property
	    // regardless how do you access this property
	    // you will get the same value
	    System.out.println("*******************");
	    System.out.println("Cititizenship from person1: " + person1.getCititizenship());
	    System.out.println("Cititizenship from person2: " + person2.getCititizenship());
	    System.out.println("Cititizenship from Person class: " + Person.getCititizenship());
	  }
	}
