package day40;

public class Phone {

	// this parameters will be accessed only through the object
	//if you are outside the class
	// these are instance variables

	String brand; // instance variable
	String OS;
	int storageSize;
	double screenSize;
	int ram;
	int camera;
	double price;
	String color;
	boolean isWaterResistant;
	boolean suports5G;
	String cpu;
	long imei;
	String model;

	public void call() {
		System.out.println("Phone is calling");
	}

	public void ring() {
		System.out.println("Phone is ringing");
	}

	public void dial(long phoneNumber) {
		System.out.println("Dialing..." + phoneNumber);
	}

	public void sendSMS(String sms, long phoneNumber) {
		System.out.println("Sendig sms..." + sms + ", to: " + phoneNumber);
	}

}
