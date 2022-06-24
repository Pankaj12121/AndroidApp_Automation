package J4.com.demo.methods;

public class ReturnMethods {
	static String name;
	static int monthlySalary;
	
	
	static String getEmpName() {
		return name="Augusta";
	}
	static int getSalaryDetails() {
		return monthlySalary=350000;
	}
	static boolean getJobStatus() {
		return true;
	}
	public static void main(String[] args) {
		if(getJobStatus()){
			name = getEmpName();
			monthlySalary=getSalaryDetails();
			System.out.println("Emp name is "+name);
			System.out.println("Emp salary is "+monthlySalary);
		}else{
			System.out.println("The employee Mr. "+ getEmpName() +"is no more associated with the company ");
			
		}
	}

}
