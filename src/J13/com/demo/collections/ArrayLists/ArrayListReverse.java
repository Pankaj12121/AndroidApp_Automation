package J13.com.demo.collections.ArrayLists;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> arrayListParent = new ArrayList<ArrayList<String>>();
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("CC");
		arrayList.add("E");
		arrayList.add("E");
		arrayListParent.add(arrayList);
		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("AA");
		arrayList2.add("BB");
		arrayList2.add("CC");
		arrayList2.add("DD");
		arrayList2.add("EE");
		arrayListParent.add(arrayList2);
		
		if(actualnExpected_same(arrayList,"E","E"))
			System.out.println("TestCase passed");
		else
			System.out.println("TestCase Failed");
			
		/*if(arrayListParent.get(0).get(2).equals(arrayListParent.get(1).get(2)))
			System.out.println("TestCase passed");
		else
			System.out.println("TestCase Failed");*/
		
		/*String ExpectedFromPage="E";
		if (ExpectedFromPage.equals(getActualValue(arrayList, ExpectedFromPage)))
			System.out.println("TestCase passed");
		else
			System.out.println("TestCase Failed");*/

	}

	public static String getActualValue(ArrayList<String> listActual, String actualV) {
		String TestCaseActValue = "NoMatch";
		for (String actValue : listActual) {

			if (actValue.equals(actualV)) {
				TestCaseActValue = actValue;
				break;
			}

		}

		return TestCaseActValue;

	}

	public static boolean actualnExpected_same(ArrayList<String> listActual, String actualV, String ExpectedV) {
		boolean sameValueFlag = false;
		String loopActualValue = "NoMatch";
		String loopExpectedValue = "NoMatch";
		int ActualmatchCounter = 0;
		for (String actValue : listActual) {

			if (actValue.equals(actualV)) {
				loopActualValue = actValue;
				if (actValue.equals(ExpectedV)) {
					loopExpectedValue = actValue;
				}

				if (loopActualValue.equals(loopExpectedValue) && !loopActualValue.equals("NoMatch")
						&& !loopExpectedValue.equals("NoMatch"))
					ActualmatchCounter++;
				if (ActualmatchCounter >= 2) {
					sameValueFlag = true;
					break;
				}
			}

		}

		return sameValueFlag;

	}
	
	public static boolean actualnExpected_diff(ArrayList<String> listActual, String actualV, String ExpectedV) {
		boolean sameValueFlag = false;
		String loopActualValue = "NoMatch";
		String loopExpectedValue = "NoMatch";
		int ActualmatchCounter = 0;
		for (String actValue : listActual) {

			if (actValue.equals(actualV)) {
				loopActualValue = actValue;
				if (actValue.equals(ExpectedV)) {
					loopExpectedValue = actValue;
				}

				if (loopActualValue.equals(loopExpectedValue) && !loopActualValue.equals("NoMatch")
						&& !loopExpectedValue.equals("NoMatch"))
					sameValueFlag = true;
				else {
					sameValueFlag = true;
					break;
				}
			}

		}

		return sameValueFlag;

	}
}
