package day58_Interface_review___polymorphismintro;

public class Cat extends Animal
			implements IndoorPet {
	@Override
	public void makeNoise() {
		System.out.println("meow meow");
}}


