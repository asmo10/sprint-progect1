
public class Spartan {

	// method is created inside class

	// it should not be inside any method (like main method)

	// method is a action --> always named like doSomething, as verb

	// method name just like variable name always start with

	// lowercase by convention , use camelCase for multiple words

	public static void releaseTheHorse() {

		System.out.println("RELEASE IT NOW PLEASE !!!!");

		System.out.println("GO !!!!");

	}

	public static void holdYourHorse() {

		String owner = "Anar";

		System.out.println(owner + ", hold your horse please!");

	}

	public static void main(String[] args) {

		Spartan.releaseTheHorse();

		// if you are in same class where the method is defined

		// className. is optional

		releaseTheHorse();

		holdYourHorse();

		// release the horse

		// we will start with

		/*
		 * method that does not take external data method that does not return any value
		 * method that does not need an object to be called Arrays.toString(arr)
		 * Spartan.releaseTheHorse() ; public --- access modifier -- to define where it
		 * can be used for example outside the class/outside package static ---
		 * non-access modifier if defined ,no object needed to call this method void
		 * ---- it means this method only take action and does not return any value
		 */

	}

}
