package J6.com.demo.flowcontrol;

public class Forloop {

	public static void main(String[] args) {
		/******************************forloopSimple********************************      */
		for (int i = 1; i <= 10; ++i) {

			System.out.println("Line " + i);
		}

		/******************************forEachLoop*********************************************/
		String[] values = new String[4];
		values[0] = "WebDriver";
		values[1] = "Grid";
		values[2] = "IDE";
		values[3] = "RC";

		for (String value : values) {

			System.out.println(value);
		}
		
		/********************************froLoopBreak*******************************************  */ 
		for (int i = 0; i < values.length; i++) {
			if(i==0) 
				System.out.println("I am into Break for loop");
			if (values[i] == "IDE") {
				break;
			}
			System.out.println(values[i]);
		}

		/************************************forloopContinue********************************************/
		for (String value : values) {

			if (value.startsWith("G")) {
				
				continue;
			}

			System.out.println(value);
		}
	}
}