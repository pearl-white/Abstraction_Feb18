 package abstraction_Feb21;

 public abstract class Vehicle {
	
	 protected int currentSpeed;
	 
	 
	 public abstract void start();
		 
	 
	 public abstract void accelerate (int mph);
	 
	 
	 
	 
	 
	 public void stop(){
		 System.out.println("Stopped");
	 }
	 
	 
	 
	 public int getCurrentSpeed(){
		 return currentSpeed;
	 }
	 
	 
	 
	  
}
 
 
