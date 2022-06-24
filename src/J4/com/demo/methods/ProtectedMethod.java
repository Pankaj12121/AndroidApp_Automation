package J4.com.demo.methods;

public class ProtectedMethod {
	
	  protected void userNameDisplay() {
	        System.out.println("Mr. peter user name is peter@GM");
	    }
	  
	  private void passwordDisplay() {
	        System.out.println("Mr. peter password is mypass@658978");
	    }
	  
	  public static void main(String[] args) {
		  ProtectedMethod proMethod= new ProtectedMethod();
		  proMethod.userNameDisplay();
		  proMethod.passwordDisplay();
		
	}

}
