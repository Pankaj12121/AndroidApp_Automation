package J4.com.demo.methods;

public class ProtectedMethodImplementation extends ProtectedMethod{
	
	@Override
	protected void userNameDisplay() {
		// TODO Auto-generated method stub
		super.userNameDisplay();
	}
	
	public static void main(String[] args) {
	ProtectedMethodImplementation pmi= new ProtectedMethodImplementation();
	pmi.userNameDisplay();
	//pmi.passwordDisplay(); private method can not access in child class too.
	
	}

}
