package Polymorphism_Feb25;

public class EBook extends Book implements Shipping ,Prime {
	   
	public boolean isPrimeMember(){
		return false;
	}

	public boolean isUsableCondition(){
		System.out.println("can be used   ");
		return true;
	}
	
	public  void purchase (){
	 System.out.println("You are purchasing a science fiction EBook");
	}
	
	public  void read (){
		System.out.println("You are reading a history book"); 
	}
		
		
		public  void deliver() {
		System.out.println("Downloading the EBook");
		}
		
		public  void  expeditedShipping (boolean urgent){
		if (urgent){
			System.out.println("Available for download right instantly");
		}else{
			System.out.println("Send a link for later download");
		}}
		
		
		
	}

