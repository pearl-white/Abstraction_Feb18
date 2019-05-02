package abstraction_Feb21;

public class Car extends Vehicle {
	
	public void start(){
		System.out.println("Starting");
	}

	public void accelerate (int mph){
		currentSpeed+=mph;
		
	}
}
