package J6.com.demo.flowcontrol;

public class SwitchStatement {
	public enum days{monday,tuesday}
	static int month=6;
	static int daysOfMonth;
	public static void main(String[] args) {
		
		for (int i = 0; i <= 4; i++) {
			// Switch on number.
			switch (i) {
			case 1: {
				System.out.println("One: " + i);
				break;
			}
			case 2:
				//break;
			case 3: {
				System.out.println("Two or three: " + i);
				//break;
			}
			default: {
				System.out.println("Default case: " + i);
			}
			}
		}

	
	
	
	
	switch (month) {
	case 4: case 6: case 9: case 11:
	daysOfMonth = 30;
	break;
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	daysOfMonth = 31;
	break;
	case 2:
	daysOfMonth = 28;
	break;
	default:
	daysOfMonth = 0;
	System.out.println("Month is not valid");
	}
	System.out.println("Days: " + daysOfMonth);

}
}