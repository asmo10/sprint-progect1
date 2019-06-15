package day47;

public class Bike2 {
	
	private String brand;
	private int gear;
	private int speed;
	private int id;
	
	private static int countOfBike;
	
	private Bike2() {
		System.out.println("no arg is being called");
		++countOfBike;
		this.id=countOfBike;
	}
	public Bike2(String brand, int gear, int speed) {
		this();
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
		}
	
	public static void resetCount() {
		countOfBike=0;
	}
	
	public static void showCurrentCount() {
		System.out.println("Current Count of object is "+countOfBike);
	}
	
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public int getGear() {
//		return gear;
//	}
//	public void setGear(int gear) {
//		this.gear = gear;
//	}
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	public int getId() {
//		return id;
//	}

	
	public void speedUp(int increaseBy) {
		speed+=increaseBy;
	}
	
	public void slowDown(int decreaseBy) {
		speed-=decreaseBy;
	}
	
	public void slowDown(int decreaseBy, int x) {
		speed-=decreaseBy+x;
	}
	
	@Override
	public String toString(){
		return "Bike2 [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	}
	
	

}
