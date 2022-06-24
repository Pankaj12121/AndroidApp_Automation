package J9.com.demo.oops.inheritance;

public class SubClass extends SuperClass{
	
	public SubClass(int k) {
		System.out.println("Test Constructor");
	}
	
	public static void main(String[] args) {
		SubClass sc= new SubClass(5);
	}

}
