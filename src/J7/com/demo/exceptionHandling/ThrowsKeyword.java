package J7.com.demo.exceptionHandling;

import java.io.IOException;

public class ThrowsKeyword {
	public void m()throws IOException{  
		throw new IOException("device error");//checked exception  
	}  
	public void n()throws IOException{  
		m();  
	}  
	public void p() throws IOException{  
		try{  
			n();  
		}catch(Exception e){
			System.out.println("exception handled");
		}  
	}  
	public static void main(String args[]) throws IOException{  
		ThrowsKeyword obj=new ThrowsKeyword();  
		obj.p();  
		System.out.println("normal flow...");  
	}  

}
/*throw Vs	throws
1)	Java throw keyword is used to explicitly throw an exception.
	Java throws keyword is used to declare an exception.
2)	Checked exception cannot be propagated using throw only.	
	Checked exception can be propagated with throws.
3)	Throw is followed by an instance.
	Throws is followed by class.
4)	Throw is used within the method.	
	Throws is used with the method signature.
5)	You cannot throw multiple exceptions.
	You can declare multiple exceptions e.g.
	public void method()throws IOException,SQLException.*/