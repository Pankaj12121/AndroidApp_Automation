package J4.com.demo.methods;

public class MethodOverload {
	 public static void action(int value) {
	        System.out.println("Int = " + Integer.toString(value));
	    }

	    public static void action(String value) {
	        System.out.println("Length = " + value.length());
	    }

	    public static void main(String[] args) {
	        action(1);
	        action("cat");
	    }

}
