package J4.com.demo.methods;

public class VariableArgsList {
	
	 static void displayAll(int... test) {
	        // The argument is an int array.
	        for (int value : test) {
	            System.out.println(value);
	        }
	        System.out.println("DONE");
	    }

	    public static void main(String[] args) {
	        // Pass variable argument lists to displayAll method.
	       displayAll(100,200,300);
	       displayAll(0,20,40,60,70);
	       displayAll(0,20,40,60,70,20,30,50,60);
	       displayAll();
	    }

}
