package interface_Feb21;

public class Bus implements Driver{
	public void turn(String side){
		System.out.println("Bus is turning"+ side);
	}
	
	public void changeLanes(String side){
		System.out.println("Bus is changing lanes"+side);
	}
}
