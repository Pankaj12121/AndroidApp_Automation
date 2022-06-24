package J7.com.demo.exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		FinallyBlock FB= new FinallyBlock();
		FB.ExceptionDoesntOccur();
		FB.ExceptionOccursButNotHandled();
		FB.ExceptionOccursAndHandled();
	}

	public static void ExceptionDoesntOccur(){
		try{  
			int data=25/5;  
			System.out.println(data);  
		}  
		catch(NullPointerException e){
			System.out.println(e);
		}  
		finally{
			System.out.println("finally block is always executed");
		}  
		System.out.println("rest of the code...");  
	}  

	public static void ExceptionOccursButNotHandled(){  
		try{  
			int data=25/0;  
			System.out.println(data);  
		}  
		catch(NullPointerException e){
			System.out.println(e);
		}  
		finally{
			System.out.println("finally block is always executed");
		}  
		System.out.println("rest of the code...");  
	}  

	public static void ExceptionOccursAndHandled(){  
		try{  
			int data=25/0;  
			System.out.println(data);  
		}  
		catch(ArithmeticException e){
			System.out.println(e);
		}  
		finally{
			System.out.println("finally block is always executed");
		}  
		System.out.println("rest of the code...");  
	}  
}
