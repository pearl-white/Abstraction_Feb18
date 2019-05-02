package Polymorphism_Feb25;

public interface Shipping {
	
//	public Shipping (){	}

	public static final int PRICE_PER_OUNCE=1;
	boolean FREE_SHIPPING=false;
	
	
	public abstract void deliver();
	public abstract void expeditedShipping(boolean urgent);
	
	public default void defaultMethod(){
		
	}
	
	public static void staticMethod(){
		System.out.println("Static method from interface");
	}


	
	
}
