package J5.com.demo.block;

public class StaticAndInstanceBlock {

	int speed;
	static String city="Delhi";

	public StaticAndInstanceBlock(){
		System.out.println("speed is of a car is "+speed+" and testDrive city is "+ city);
	}

	{
		speed = 120;
		System.out.println("Instance block executed");
	}
	static{
		city = "Mumbai";
		System.out.println("Static block executed");
	}

	public static void main(String args[]){
		StaticAndInstanceBlock c1=new StaticAndInstanceBlock();
	}    
}


