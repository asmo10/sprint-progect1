package day43_Getter_Setter_Constractor;

import java.util.*;

public class Vehicle {

	  private String make;
	  private int speed;
	  private String model;

	  
	  
	  
	  
	  /////////////////////////////////
	  
	  
	  
	  
	  public void increaseSpeed(int increaseBy) {

	    // speed = speed + increaseBy;
	    for (int i = 1; i <= increaseBy; i++) {

	      speed++ ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	  }
	  
	  public void decreaseSpeed(int decreaseBy) {
	    
	    for (int i = 1; i <= decreaseBy; i++) {

	      speed-- ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	    
	  }

	  public String getModel() {
	    return model;
	  }

	  public void setModel(String newModel) {
	    model = newModel;
	  }

	  public String getMake() {
	    return make;
	  }

	  public void setMake(String newMake) {
	    make = newMake;
	  }

	  public int getSpeed() {
	    return speed;
	  }

	  public void setSpeed(int newSpeed) {
	    speed = newSpeed;
	  }

	}
