package day58_Interface_review___polymorphismintro;

public class Dog extends Animal 
			implements IndoorPet{
	@Override
	public void makeNoise() {
		System.out.println("woof woof");
	
}
}