package Polymorphism_Feb25;

public abstract class Book extends UsedBooks{
	private String title;
	
	public Book(){
		super();
		System.out.println("new Book");
	}
	
	public boolean isUsableCondition(){
		System.out.println("can be used FROM BOOK CLASS");
		return true;             // you can do this in Book class instead of doing it in Shipping class.
		
	}
	
	public abstract void purchase ();
	
	public abstract void read ();
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public static void staticMTest(){
		System.out.println("Static from abstract class");
	}
	
	
	
}
