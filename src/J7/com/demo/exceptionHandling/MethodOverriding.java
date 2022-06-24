package J7.com.demo.exceptionHandling;

import java.io.IOException;

public class MethodOverriding {

	public void msg() throws IOException{
		System.out.println("parent");
	}  
}  
//Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
class TestExceptionChild extends MethodOverriding{  
	public void msg()throws IOException{  
		System.out.println("TestExceptionChild");  
	}  
	public static void main(String args[]) throws IOException{  
		MethodOverriding p=new TestExceptionChild();  
		p.msg();  
	}  
}


