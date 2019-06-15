package day57_Interface;


public class IceCoffee implements Drinkable{
	String size;
//	public abstract void eat(); 
//	public abstract void drink();
	
	public void eat() {
		System.out.println("nice ice cofee and burger");
	}
	public IceCoffee(String size) {
		this.size = size;
	}
	public void drink() {
		System.out.println("nice ice");
	}
	public static void main(String[] args) {
		Burger b1=new Burger("Andy burg", 5);
		b1.eat();
		
		
		IceCoffee ice1=new IceCoffee("small");
		ice1.drink();
		ice1.eat();
	}
}