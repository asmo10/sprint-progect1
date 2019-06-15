package day54;

public class Engine {

	final String engineType;
	int cilinderCount;
	
	public Engine(String engineType, int cilinderCount) {
//		super();
		this.engineType = engineType;
		this.cilinderCount = cilinderCount;
	}
	
	public void start() {
		System.out.println("Engine "+engineType
				+" with cilinderCount "+cilinderCount+" is starting");
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", cilinderCount=" + cilinderCount + "]";
	}

	

}


//FINAL TASK 
//
//CREATE A CLASS CALLED Engine 
//	final instance fileds : 
//	 engineType as String 
//	 cilinderCount as int 
//
//	2 arg constructors to set the fields value 
//
//	instance method : 
//		start() accept no param and return nothing 
//			print engine <type> with cilinderCount <count> is starting
//	toString method 
//
//CREATE A CLASS CALLED SuperCar
//	--> final instance variables 
//	it has instance fields model make as String 
//		engine as Engine 
//
//	Create 3 args constructors to set all the value 
//	toString() method 
//
//	instance method : 
//		start() 
//			start() accept no param and return nothing 
//			call the Engine's start method 
//
//			print out super car <Make> <Model> 
//				with <EngineCilinderCount> is starting  
//
//create main method to create Engine object 	
//		Create a SuperCar obejct and call it's method 
//
