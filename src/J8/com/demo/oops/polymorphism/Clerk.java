package J8.com.demo.oops.polymorphism;

public class Clerk extends Employee{
	
	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return super.salary()+1000;
	}

}
