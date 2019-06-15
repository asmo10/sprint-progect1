package day60;


import day58_Interface_review___polymorphismintro.*;;


public class ShapeUtility {

	  public static void main(String[] args) {  
	      
	    describeTheShape(  new Triangle("Red",12, 10));
	    
	    Shape s1 = new Triangle("Red",12, 10); 
	    describeTheShape(  s1  );
	    
	    describeTheShape( new Square("blue", 5));
	    
	    // something ridiculous but focus on concept itself 
	    describeTheShape( new Dog() ); 
	    
	    
	    Shape myShape = getAnyShape() ;
	    myShape.draw();
	    
	    Drawable myDrawable = getAnDrawable() ; 
	    myDrawable.drawLine(2);
	    
	  }
	  
	  public static Drawable getAnDrawable() {
	    
	    Drawable d1 = new Triangle("Red",120, 100) ; 
	    return d1; 
	    
	    // return new Triangle("Red",120, 100)
	    
	  }
	  
	  public static Shape getAnyShape() {
	    
	    Shape s1 = new Square("blue", 15); 
	    
	    return s1 ; 
	    // return  new Square("blue", 15); 
	        
	  }
	  
	  // we dont want to create object while calling this 
	  // utlity method so we just made it static 
	  public static void describeTheShape(Shape anyShape) {  
	    
	    System.out.println("calling describeTheShape(Shape anyShape)");
	    anyShape.draw();

	  }
	  // create another method that accept Triangle object only 
	  
	  
	  public static void describeTheShape(Triangle anyTriangle) {  
	    System.out.println("calling describeTheShape(Triangle anyTriangle)");
	    anyTriangle.draw();
	  }
	  
	  // do not get fooled by the name 
	  // it accept any type of Object 
	  public static void describeTheShape(Object anyObject) {  
	    System.out.println("calling describeTheShape(Object anyObject))");
//	    anyObject.draw();
//	    anyObject.makeNoise(); 
	  }
	  
	}

