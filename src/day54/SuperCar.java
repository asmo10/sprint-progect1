package day54;

public class SuperCar {

	
	final String model;
	final String Make;
	final Engine engine;
	
	public SuperCar(String model, String make, Engine engine) {
//		super();
		this.model = model;
		Make = make;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "SuperCar [model=" + model + ", Make=" + Make + ", engine=" + engine + "]";
	}
	
	public void start() {
//		super.start();
		this.engine.start();
	}



	public static void main(String[] args) {
		
		Engine eng=new Engine("V12", 12);
		System.out.println(eng);
	}	
}
