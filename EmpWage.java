import java.util.ArrayList;
import java.util.Random;
public class EmpWage {
	private static final int ratePerHour=20;
	private static final int fullTime=1;
	private static final int partTime=2;
	private static final int workingDays=20;
	private static final int maxHrs=100;
	private static int totalDays=0;
	private static ArrayList<Integer> salary=new ArrayList<>();
	private static ArrayList<Integer> totalSalary=new ArrayList<>();
	public EmpWage(ArrayList salary,ArrayList totalSary,int totalDays) {
		this.salary=salary;
		this.totalSalary=totalSalary;
		this.totalDays=totalDays;
	}
	public static EmpWage salary() {
		int empHr=0,totalHrs=0,dailyWage=0,diff=0,sum=0;
		Random rand=new Random();
		while(totalDays<=workingDays && totalHrs<=maxHrs) {
			totalDays++;
			int empCheck=rand.nextInt(3);
			switch(empCheck) {
				case fullTime: empHr=8;
								break;
				case partTime: empHr=4;
								break;
				default: empHr=0;
			}
			totalHrs+=empHr;
			if(totalHrs>100) {
				diff=totalHrs-100;
				empHr-=diff;
			}
		dailyWage=ratePerHour*empHr;
		salary.add(dailyWage);
		sum+=dailyWage;
		totalSalary.add(sum);
		}
		return new EmpWage(salary,totalSalary,totalDays);
	}
	public static void disp() {
		System.out.println("Day\tDaily Wage\tTotal Salary");
		for(int i=1;i<totalDays;i++) {
			System.out.println(i+"\t"+salary.get(i)+"\t\t"+totalSalary.get(i));
			}

	}
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	EmpWage.salary();
	EmpWage.disp();
	}
}
