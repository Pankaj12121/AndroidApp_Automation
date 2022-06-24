package J3.com.demo.constructors;

public class ConstructorOverloading {
	
	   public ConstructorOverloading(){
	        System.out.println("Inside default constructor");
	    }
	    public ConstructorOverloading(int i){
	        System.out.println("Inside single parameter constructor with int value");
	    }
	    public ConstructorOverloading(String str){
	        System.out.println("Inside single parameter constructor with String object");
	    }
	    
	    public ConstructorOverloading(int i, int j){
	        System.out.println("Inside double parameter constructor");
	    }
	   
	    public static void main(String a[]){
	    	ConstructorOverloading mco = new ConstructorOverloading();
	    	ConstructorOverloading spmco = new ConstructorOverloading(10);
	    	ConstructorOverloading dpmco = new ConstructorOverloading(10,20);
	    	ConstructorOverloading dpmco1 = new ConstructorOverloading("java2novice");
	    }

}
