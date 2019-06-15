package day50;



public class StudentUser extends SlackUser{
  /*
   *   String displayName; 
    int timeZone; 
    String status; 
   * */
  int groupNumber; 

  public static void main(String[] args) {
    
    //StudentUser s1 = new StudentUser(); 
    
    StudentUser s2 = new StudentUser("Sumeyye",6,"available",26);
    System.out.println(s2);
    
  }


  public StudentUser() {
    super(); 
    System.out.println("Student User no arg");
  }

  public StudentUser(String displayName, int timeZone, 
          String status, int groupNumber) {
     //super();
      this.displayName = displayName;
      this.timeZone = timeZone;
      this.status = status;
      this.groupNumber = groupNumber; 
  }

  public String toString() {
    return "StudentUser [groupNumber=" + groupNumber 
        + ", displayName=" + displayName 
        + ", timeZone=" + timeZone
        + ", status=" + status + "]";
  }
  
  
  
  
  
  
  /*
  public void sendMessage(String message) {
    
    System.out.println("<"+displayName+"> is sending <" 
            + message+">" );
    
  }
  
  public void changeStatus(String status) {
    this.status = status;
  }
   * */
  
  
}

  
