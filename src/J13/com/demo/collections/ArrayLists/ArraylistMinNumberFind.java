package J13.com.demo.collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistMinNumberFind {
	public static void main(String[] args) {

		//create an ArrayList object
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(327482);
		arrayList.add(13408);
		arrayList.add(802348);
		arrayList.add(345308);
		arrayList.add(509324);

		/*
		       To find minimum element of Java ArrayList use,
		       static Object min(Collection c) method of Collections class.

		       This method returns the minimum element of Java ArrayList according to
		       its natural ordering.
		 */

		Object obj = Collections.max(arrayList);

		System.out.println("Minimum Element of Java ArrayList is : " + obj);
	}

}
