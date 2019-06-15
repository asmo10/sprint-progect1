package day41_2_evening_session;


	public class AirConditioner {
		// we have to provide instance variables
		// that will describe AC
		// instance variables
		String brand;
		float temperature;
		String mode = "cool";
		String color;
		boolean remoteControl;
		float price;
		boolean isOn;
		int ecoLevel;
		static String test ="static variable";
		//only final suppose to be all upper case
		final static float MAX_TEMPERATURE = 100;
		final static float MIN_TEMPERATURE = 50;
		static int countsold;

		// this is instance method
		public void displayBrand() {
			System.out.println("The brand is: " + brand);
		}

		public void showCurrentTemperature() {
			System.out.println("Current temperature: " + temperature);
		}

		public void increaseTemperature(float temp) {
			if(temperature + temp > MAX_TEMPERATURE) {
				System.out.println("Temperature is too high!");
			}
			temperature = temperature + temp;
		}

		public void decreaseTemperature(float temp) {
			if(temperature + temp > MIN_TEMPERATURE) {
				System.out.println("Temperature is too low!");
			}
			temperature = temperature - temp;
		}

		public void turnOn() {
			// we are checking if ac is off
			if (isOn == false) {
				// changing status....
				// set it to true, make it on
				isOn = true;
				System.out.println("AC is on");
			} else {
				// it's already on, no need to turn on again
				System.out.println("AC is alredy on!!!");
			}
		}

		public void turnOff() {
			if (isOn == true) {
				// changing status....
				// set it to false, make it off
				isOn = false;
				System.out.println("AC is off");
			} else {
				// it's already off, no need to turn off again
				System.out.println("AC is alredy off!!!");
			}
		}

		public void getEcoLevel() {
			System.out.println("Eco level is: " + ecoLevel);
		}

		public void displayPrice() {
			System.out.println("Price: " + price);
		}

		public void remoteControlAvailability() {
			System.out.println("Remote control: " + remoteControl);
		}

		public void setMode(String season) {
			switch (season) {
			case "Summer":
				mode = "cool";
				System.out.println("@@@@Summer mode!@@@@");
				break;
			case "Winter":
				mode = "heat";
				System.out.println("****Winter mode!****");
				break;
			default:
				System.out.println("Wrong mode!");
			}
		}

		// this method will provide full description about AC
		public void printInfo() {
			System.out.println("Brand: " + brand + ", Current temperature: " 
							+ temperature + ", Mode: " + (mode==null?"": mode)+", Color: "+color
							+",\n Eco level: "+ecoLevel+", Price: "+price
							+"$, Has remote? "+remoteControl+", Is on? "+isOn);
		}

	}
