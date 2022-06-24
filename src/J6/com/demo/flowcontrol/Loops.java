package J6.com.demo.flowcontrol;

public class Loops {

	static String[] clients = { "Mr.Dinesh", "Mr.Ramesh", "Mrs.Meena", "Adv.Ganesh", "Adv.Mahesh" };
	static boolean isExecutionInProgress = true;

	public static void main(String[] args) {
		m1();
		m2();
		m3(1,25);
	}

	public static void m1() {

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0)

				continue;

			System.out.println("i is odd number " + i);

		}

	}

	public static void m2() {

		for (String name : clients) {
			if (name.contains("Mr"))
				continue;
			System.out.println("Adv name is " + name);

		}

	}

	public static void m3(int counter, int lastTC) {
	
		while (isExecutionInProgress) {

			System.out.println("Testcase no " + counter + " is executed.");
			if (lastTC == counter) {
				isExecutionInProgress = false;
				System.out.println("Test Suite completed ");
			}
			counter++;
		}

	
	}
}
