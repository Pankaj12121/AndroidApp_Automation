package J12.com.demo.oops.encapsulations;
public class EncapsulationDemo {
	private	int balance =100000;
	private String customerName="vishal";
	int FDAmount=3000000;
	static String password="Ramesh";
	
	public int getBalance(String cn) {
		if (cn==customerName){
			System.out.println("Account balance is "+balance);
			return balance;
		}else{
			System.out.println("invalid customer name");	
		}
		return 0;
	}
	public void setBalance(int balance1,String cn) {
		if (cn==customerName){
		this.balance = balance+balance1;
		System.out.println("Account balance is "+balance);
		}else{
			System.out.println("invalid customer name");
		}
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getFDAmount() {
		return FDAmount;
	}

	public void setFDAmount(int fDAmount) {
		FDAmount = fDAmount;
	}
	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		EncapsulationDemo.password = password;
	}

}
