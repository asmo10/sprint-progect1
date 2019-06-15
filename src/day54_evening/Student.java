package day54_evening;

public class Student extends Person {
	  private int student_id;

	  public Student(String name, int age, char gender, int student_id) {
	    super(name, age, gender);
	    this.student_id = student_id;
	  }

	  public int getStudent_id() {
	    return student_id;
	  }

	  public void setStudent_id(int student_id) {
	    this.student_id = student_id;
	  }
	  
	  @Override
	  public String toString() {
	    return "Student [name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() 
	    + ", student_id="+student_id+"]";
	  }

	}


