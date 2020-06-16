import java.util.Random;
public class EmpWage {
	static final int ratePerHour=20;
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	Random rand=new Random();
	int empHr=0;
	int empCheck=rand.nextInt(2);
	if(empCheck==1) {
		empHr=8;
		}
	System.out.println("Daily Wage= "+(empHr*EmpWage.ratePerHour));
	}
}
