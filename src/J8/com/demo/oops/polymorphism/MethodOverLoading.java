package J8.com.demo.oops.polymorphism;

public class MethodOverLoading {
	
	private static void display(int a){
        System.out.println("Got Integer data. "+a);
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object. " +a);
    }
    
    private static void display(double a){
        System.out.println("double Arguments: " + a);
    }

    private static void display(int a, String b){
        System.out.println("Arguments: " + a + " is " + b);
    }


    public static void main(String[] args) {
    	
    	display(1000);
    	display("Hello");
    	display(100.10);
    	display(10, "Lucky Number");
       
    }


}
