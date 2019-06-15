package _224_OOP_17_Dog;

public class test {

	public static void main(String[] args) {

		Dog d=new Dog("muhtar", 10, "german shepard");
		
		System.out.println(d.getAgeInHumanYears());
		System.out.println(d);
		Dog x=new Dog("muhtar", 12, "german shepard");
		System.out.println(d.equals(d, x));
	}

}
