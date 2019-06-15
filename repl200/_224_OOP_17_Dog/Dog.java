package _224_OOP_17_Dog;

public class Dog extends Animal {

	private String breed;
	private int humanYears;

	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
		getAgeInHumanYears();
		}



	@Override
	public String toString() {
		return 
	"Name: " + getName() +"\n"
	+ "Breed: " + getBreed() +"\n"
	+"Age in calendar years: " + getAge() +"\n"
	+"Age in human years: " + humanYears;
	}



	@Override
	public int getAgeInHumanYears() {
	    if(super.getAge()<=2)	humanYears=getAge()*11;
	    else humanYears=22+((getAge()-2)*5);
	    return humanYears;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public int getHumanYears() {
		return humanYears;
	}

	public void setHumanYears(int humanYears) {
		this.humanYears = humanYears;
	}

	public boolean equals(Dog obj1, Dog obj2 ) {
		if(obj1.getName()==obj2.getName()&
				obj1.getAge()==obj2.getAge()&
				obj1.getBreed()==obj2.getBreed())return true;
		else return false;
	}
}
