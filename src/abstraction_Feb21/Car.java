package abstraction_Feb21;

public class Car extends Vehicle {

	public void start() {
		System.out.println("Starting"); // line...
	}

	public void accelerate(int mph) {
		currentSpeed += mph;

	}
}
