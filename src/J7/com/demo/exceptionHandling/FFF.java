package J7.com.demo.exceptionHandling;

public class FFF {
	public static void main(String[] args) {

	}
	public static void finalKeyword(){  
		final int x=100;  
		x=200;//Compile Time Error  
	}
	public static void finallyKeyword(){  
		try{  
			int x=300;  
		}catch(Exception e){
			System.out.println(e);
		}  
		finally{
			System.out.println("finally block is executed");
		}  
	}

	public static void finalizeKeyword(){  
		FFF f1=new FFF();  
		FFF f2=new FFF();  
		f1=null;  
		f2=null;  
		System.gc();  
	}
}  

/*Final is used to apply restrictions on class, method and variable. Final class can't be inherited, 
final method can't be overridden and final variable value can't be changed.

Finally is used to place important code, it will be executed whether exception is handled or not.

Finalize is used to perform clean up processing just before object is garbage collected.*/
