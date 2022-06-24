package J7.com.demo.exceptionHandling;

import java.io.IOException;

public class ThrowKeyword {

	static void validate(int age){  
		if(age<18)  {
			throw new ArithmeticException("not valid");  
		}else  
			System.out.println("welcome to vote");  
	}  
	public static void main(String args[]){  
		try{
		validate(13);  
		System.out.println("check this get printed");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("check this exception get printed");
			
		}finally{
		System.out.println("rest of the code...");  
		}
	}  

}
