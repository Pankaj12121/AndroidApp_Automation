package J7.com.demo.exceptionHandling;

public class TryCatch2 {

	public static void main(String[] args) {
		try{
			System.out.println("no error here");
			int data=50/0;  
		}catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("rest of the code...");  
		}catch(NullPointerException e1){
			System.out.println("data in excel is not proper");
			
		}catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("data array range is not proper");
			
		}catch(Exception e3){
			System.out.println("generic exception need to see stack strace");
		}
		finally{
			System.out.println("Execution completed, close the resources");
		}
	}  
}


