package day57_Interface;


public class Burger implements Edible{
	String name;
	int size;

	public Burger(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Burger [name=" + name + ", size=" + size + "]";
	}
	public void eat() {
		System.out.println("nice burger");
	}
}