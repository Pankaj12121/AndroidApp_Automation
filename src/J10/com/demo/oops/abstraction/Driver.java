package J10.com.demo.oops.abstraction;

public class Driver {
	
	
	public static void main(String[] args) {
		
		SendSMS airTel= new Airtel();
		SendSMS vodaFone= new Vodafone();
		airTel.eastablishConnectionWithYourTower();
		airTel.destroyConnectionWithYourTower();
		airTel.checkForDND();
		airTel.checkForTelecomRules();
		System.out.println("-------------------------------------------------------------------");
		vodaFone.eastablishConnectionWithYourTower();
		vodaFone.destroyConnectionWithYourTower();
		vodaFone.checkForDND();
		vodaFone.checkForTelecomRules();
		
		
		/*All methods in an interface are implicitly abstract. On the other hand, an abstract class may contain both abstract and non-abstract methods.
		A class may implement a number of Interfaces, but can extend only one abstract class.
		In order for a class to implement an interface, it must implement all its declared methods. However, a class may not implement all declared methods of an abstract class. Though, in this case, the sub-class must also be declared as abstract.
		Abstract classes can implement interfaces without even providing the implementation of interface methods.
		Variables declared in a Java interface is by default final. An abstract class may contain non-final variables.
		Members of a Java interface are public by default. A member of an abstract class can either be private, protected or public.
		An interface is absolutely abstract and cannot be instantiated. An abstract class also cannot be instantiated, but can be invoked if it contains a main method.*/
	}

}
