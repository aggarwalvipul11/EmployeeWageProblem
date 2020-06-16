import java.util.Random;
public class EmpWage {
	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation");
	Random rand=new Random();
	int empCheck=rand.nextInt(2);
	if(empCheck==1) {
		System.out.println("Employee present");
		}
	else
		System.out.println("Employee Absent");
	}

}
