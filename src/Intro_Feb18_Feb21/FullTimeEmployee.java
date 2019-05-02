package Intro_Feb18_Feb21;

public class FullTimeEmployee extends Employee implements Payable {
	private double monthlyRate;
	private int numberOfMonths;
	
	public  double calculateOvertime(){
		return 0;
	}
	
	public void calculatePay(){
		earnings=numberOfMonths*monthlyRate+calculateBonus();
	}
	
	
	   public  double calculateBonus(){
		   if (numberOfMonths>=2){
			   return numberOfMonths*monthlyRate*BONUS_RATE;
		   }
		   return 0;
	   }
	
	
	
	
	
	
	public int getNumberOfMonths() {
		return numberOfMonths;
	}



	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}



	public double getMonthlyRate() {
		return monthlyRate;
	}

	public void setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}
	
	
	
}
