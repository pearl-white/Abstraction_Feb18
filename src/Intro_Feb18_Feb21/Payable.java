package Intro_Feb18_Feb21;

public interface Payable {
   public static final double OVERTIME_RATE=1.5;
   double BONUS_RATE=0.1;
   
   public abstract double calculateOvertime();
   public default double calculateBonus(){
	   return 0;
   }
}
