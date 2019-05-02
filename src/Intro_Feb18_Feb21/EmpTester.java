package Intro_Feb18_Feb21;

public class EmpTester {
public static void main(String[] args) {
	
	HourlyEmployee emp1=new HourlyEmployee();
	emp1.setHours(39);
	emp1.setHourlyRate(100);
	emp1.calculatePay();
	double totalPay=emp1.getEarnings();
	System.out.println("Total pay is: " + totalPay);
	
	
	
	FullTimeEmployee ft1=new FullTimeEmployee();
	ft1.setMonthlyRate(9500.0);
	ft1.setNumberOfMonths(5);
	ft1.calculatePay();
	totalPay=ft1.getEarnings();
	System.out.println("Total pay for FT employee is: "+ totalPay);
	
	
	
	
	
}
}
