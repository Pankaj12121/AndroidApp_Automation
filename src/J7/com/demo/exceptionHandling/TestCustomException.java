package J7.com.demo.exceptionHandling;

public class TestCustomException {
	
	static void validate(int age)throws CustomException{  
		if(age<18)  
			throw new CustomException("not valid");  
		else  
			System.out.println("welcome to vote");  
	}  

	public static void main(String args[]){  
		try{  
			validate(13);  
		}catch(Exception m){System.out.println("Exception occured: "+m);}  

		System.out.println("rest of the code...");  
	}  

}
