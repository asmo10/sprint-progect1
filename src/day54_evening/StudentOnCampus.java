package day54_evening;

public class StudentOnCampus extends Student {
	  private boolean isOnCampus;

	  public StudentOnCampus(String name, int age, char gender, int student_id) {
	    super(name, age, gender, student_id);
	    System.out.println("StudentOnCampus constructor");
	  }

	  // this is an action
	  public void goToCampus() {
	    // before changing status, we will check it first.
	    if (isOnCampus == false) { // or !isOnCampus
	      isOnCampus = true;
	      System.out.println("Coming to the campus..");
	    } else {
	      System.out.println("No need to go anywhere, already here.");
	    }
	  }

	  // we need it, in order to access isOnCampus
	  // instance variable outside
	  public boolean getIsOnCampus() {
	    return isOnCampus;
	  }

	}
