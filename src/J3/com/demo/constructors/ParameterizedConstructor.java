package J3.com.demo.constructors;

public class ParameterizedConstructor {

	private String name;

	public ParameterizedConstructor(String str){
		this.name = str;
		System.out.println("I am inside parameterized constructor.");
		System.out.println("The parameter value is: "+name);
	}

	public static void main(String a[]){
		ParameterizedConstructor mpc = new ParameterizedConstructor("Selenium is best tool");
		System.out.println(mpc);
	}
}



