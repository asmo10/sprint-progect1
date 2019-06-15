package _201_OOP_6_TV_1;

public class TV {

//	 Write a custom class TV that has 4 instance variables: int channel=1, int volumeLevel=1, 
//	boolean on = false, String brand = "undefined".     

	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

//	Create one "no arguments" constructor that prints message: "Creating TV object using no Args- constructor".

	TV() {
		System.out.println("Creating TV object using no Args- constractor");
	}

//			 Also, create one more constructor that defines instance variable brand, and displays message:
//			"Creating TV object using 1 arg - constructor".
	TV(String brand){
		System.out.println("Creating TV object using 1 arg - constractor");
		
	}
//			 Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), 
//			channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel<=0 || channel>120) System.out.println("ERROR: TV is either OFF or invalid Channel");
		else this.channel = channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if(!isOn() | volumeLevel<1 | volumeLevel>7) System.out.println("ERROR: TV is either OFF or invalid Volume level"); 
		else this.volumeLevel = volumeLevel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
//
//			 Declare methods channelUp() to increase variable channel by one, and channelDown()
//	to decrease variable channel by one.
//
	public int channelUp(){
		if(channel<120) channel++;
		return channel;
	}
	public int chanelDown() {
		if(channel>0) channel--;
		return channel;
	}
//			 Declare methods volumeUp() to increase variable volume by one, and volumeDown() 
//	to decrease variable volume by one.
	
	public int volumeUp() {
		return volumeLevel++;
	}
	public int VolumeDown() {
		return volumeLevel--;
	}
//	
	
//			 Create isOn(), turnOn() and turnOff() methods for "on" instance variable. If tv is already on,
//	no need to turn it on again, display message: "TV is already ON". If tv is already off, then no need to 
//	turn it off again, display message: "TV is already OFF". 
//
	public boolean isOn() {
		return on;
	}
	public void turnOn() {
		if(on) System.out.println("TV is alredy ON");
		else on=true;
	}
	public void turnOff() {
		if(!on) System.out.println("TV is already OFF");
		else on=false;
	}
//			 Value of a variable channel cannot be negative or zero, and cannot be higher than 120.
//	If user will try to set invalid channel, display message: "ERROR: TV is either OFF or invalid Channel".
	
//
//			 Volume can be only in the range between 1 and 7. You may change volume only if TV is on. 
//	Otherwise, display message: "ERROR: TV is either OFF or invalid Volume level". 
//	Create isOn() method that will check tv status.

	
}
