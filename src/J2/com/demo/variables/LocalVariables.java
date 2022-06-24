package J2.com.demo.variables;

public class LocalVariables {
	public int days=7;
	

	public void salary(int salesbonus) {
		int currentMonthbonus=salesbonus;
		int sal = 1000;
		sal = sal + currentMonthbonus;
		System.out.println("Monthly Salary: " + sal);
	}
	/*------------------------------------------------------------------------------------------------*/
	public static void main(String args[]) {
		LocalVariables m = new LocalVariables();
		m.salary(2000);

	}
}
