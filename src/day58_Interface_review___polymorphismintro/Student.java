package day58_Interface_review___polymorphismintro;

public class Student {

    String name;

    int age;

 

    public void Student( ) {

        Student("James", 25);

    }

    public void Student(String  name,  int  age ) {

        this.name = name;

        this.age = age;

    }
    public static void main(String[] args) {
		Student a = new Student();
    	System.out.println(a.name);
	}

}


