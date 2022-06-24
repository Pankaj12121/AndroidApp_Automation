package J6.com.demo.flowcontrol;

public class DoWhileLoopClass {

	/*	*********************************WhileLoop***********************************/
	public static void main(String[] args) {

		int i = 1;
		
		while (i <= 10) {
			System.out.println("Line " + i);
			++i;
		}

		/*	*********************************DoWhileLoop***********************************/


		do {
			System.out.print(i+" is the value of variable");
			i=i+1;
		} while(i<10);
	}
}


