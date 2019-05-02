package Intro_Feb18_Feb21;

public  class HourlyEmployee extends Employee implements Payable {
	
	private double hourlyRate;
	private int hours;
	 
	public void calculatePay(){
		earnings=hourlyRate*(hours>40  ?   40:hours)+calculateOvertime();
	}
	
	
	
		public double calculateOvertime(){
			if (hours>40){
				return (hours-40)*OVERTIME_RATE*hourlyRate;
			}
			return 0.0;
		}
	
		

	


			public int getHours() {
				return hours;
			}
		
		
			public void setHours(int hours) {
				this.hours = hours;
			}

			
			

			public double getHourlyRate() {
				return hourlyRate;
			}
		
		
			public void setHourlyRate(double hourlyRate) {
				this.hourlyRate = hourlyRate;
			}
	
	
	
	
	
}
