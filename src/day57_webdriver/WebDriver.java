package day57_webdriver;


import java.util.ArrayList;

// everything is interface  : 
  // automatically public if not defined 

public interface WebDriver {

  public static final String PURPOSE = "Automate Browser";

  public abstract void openBrowser();

  public abstract void navigateTo(String url);

  public abstract void quit();

  public abstract String findElementByID(int id);

  public abstract ArrayList<String> findElementByTagName(String tagName);

  // DEFAULT METHOD '
  // IT IS DEFINED USING DEFAULT KETWORD 
  // AND IT HAS BODY 
  // WE CAN JUST INHERIT IT AS IS 
  // or we can override to provide actual implementation 
  public default void clickButton(String name){
    
    System.out.println("DO YOUR IMPLEMENTATION WITHOUT BREAKING");
    
  } 
  // you can call abstract method in default method 
  // concrete class will have implementation anyway
     public default void clickButtonAndEnterText(){
       
       clickButton("MY BLUE BUTTON"); 
       //System.out.println("clickButtonAndEnterText DO YOUR IMPLEMENTATION WITHOUT BREAKING");
     System.out.println("Entering Cybertek");
     quit(); 
     
   } 
     
     // STATIC METHOD OF INTERFACE IS NOT INHERITED 
     public static void showPurpose() {
       System.out.println("purpose is " + PURPOSE);
    
     
     
     } 
}   

//Create an interface called WebDriver 
//
//add a constant called PURPOSE and assign "Automating Browser"
//
//add few abstract methods : 
//
//	openBrowser accept no param and return nothing
//	navigateTo accept a String as Url and return nothing 
//	quit accept no param and return nothing
//
//	findElementByID accept one int as id 
//		and return String 
//	findElementsByTagName accept one String as tagName 
//		and return List of Strings 
