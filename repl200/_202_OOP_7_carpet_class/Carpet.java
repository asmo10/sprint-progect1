package _202_OOP_7_carpet_class;

public class Carpet {

//	Carpet class has following public double instance variables: width, length, unitPrice, totalPrice
//	and a public boolean variable isPersian. true if carpet object is Persian and false if it is not.
//
//	Add following constructors:
//
//	

//	Set totalPrice as the width + length multiplied by the unitPrice.
//
//	if its a Persian carpet add 200 to totalPrice.
//
//	for example:
//	-------------------------------------------------------------------------------
	
	
	
	 //do not change -- Start
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	 //do not change -- End
	 
	//Add constructors below
//	  1) No-Args constructor
//	  -sets default values for the Carpet object
//	   Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. 
//	  unitPrice is set as 0.
//
	 public Carpet() {
		 width=300;
		 length=300;
		 totalPrice=200;
		 isPersian=false;
		 unitPrice=0;
	 }
//		2) 4-Args  Constructor:
//		- accepts width, length, unitPrice, isPersian  parameters and assigns values to public instance variables. 
//	 try to use this. keyword
	//
	public Carpet(double width, double length, double unitPrice, boolean isPersian) {
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian = isPersian;
		totalPrice=(width+length)*unitPrice;
		if(isPersian) totalPrice+=200;
	}
	 
}
