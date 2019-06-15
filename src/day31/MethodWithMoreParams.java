package day31;

import java.util.Arrays;

public class MethodWithMoreParams {

  public static void main(String[] args) {
    
    login("spartan","s300",true) ; 
    
    login("horse","h300",false) ; 
    
  }
  
  public static void login(String username, String password
              ,boolean rememberMe) {
  
    System.out.println("You entered username : " + username);
    System.out.println("You entered password : " + password);
    
    if(rememberMe==true) {
      System.out.println("you checked remeberMe checkbox");
    }else {
      System.out.println("you did not check remeberMe checkbox");
    }
    
  }
  
  
  // create a static method called login 
  /* 
   * it return nothing
   * It takes 3 parameters : 
   *     user as String , password as String, 
   *     rememberMe as boolean
   * inside body 
   *     You entered username : ----
   *     You entered password : ----
   *     print you checked remeberMe checkbox if it's true 
   *     print you did not check remeberMe checkbox if it's false
   * */
  

}


