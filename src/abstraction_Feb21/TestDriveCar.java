package abstraction_Feb21;

public class TestDriveCar {
 public static void main(String[] args) {
	
//	 Vehicle v=new Vehicle ();     will not work cuz you cnnot instantiate the abstract parent class.  
	 
	 
	 
	 Car car1=new Car();
	 car1.accelerate(60);
	 car1.stop();
	 car1.start();
	 
	 int cp=car1.getCurrentSpeed();
	 System.out.println("Driving at "+cp+ " mph...");
	 car1.stop();
	 
}
	
	
}
