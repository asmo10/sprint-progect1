package day54_evening;

public class StudentOnline extends Student {
	  private boolean isOnline;

	  public StudentOnline(String name, int age, char gender, int student_id) {
	    super(name, age, gender, student_id);
	    System.out.println("StudentOnline constructor");
	  }
	  
	  //this method will set status of isOnline variable
	  //this is an action
	  //like a setter method, it sets status 
	  public void joinZoom() {
	    if (isOnline == false) {
	      isOnline = true;
	      System.out.println("Joining class online!");
	    } else {
	      System.out.println("Already joined!");
	    }
	  }
	  
	  //will return value of isOnline instance variable.
	  //it's not an action, it's like a status report
	  public boolean getIsOnline() {
	    return isOnline;
	  }

	}

