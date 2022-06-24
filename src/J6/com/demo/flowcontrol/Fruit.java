package J6.com.demo.flowcontrol;

public class Fruit {

	public enum fruit {apple,carrot,mango,orange};


	public static void main(String[] args) {
	for(fruit s:fruit.values())
		switch(s){
		case apple:
			System.out.println("apple fruit is available");
			break;
		case carrot:
			System.out.println("carrot is available");
			break;
		default:
			System.out.println("no fruit available");
			break;
		}
	}
}
