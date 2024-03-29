package _224_OOP_17_Dog;

public abstract class Animal {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract int getAgeInHumanYears();

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
