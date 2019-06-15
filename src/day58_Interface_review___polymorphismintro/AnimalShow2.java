package day58_Interface_review___polymorphismintro;

public class AnimalShow2 {

	public static void main(String[] args) {

	Animal[] a=new Animal[3];
		
		Animal c=new Cat();
		Animal h=new Horse();
		Animal d=new Dog();
		
		a[0]=c;
		a[1]=h;
		a[2]=d;
		for (Animal each : a) {
			each.makeNoise();
		}
		
	}
}
