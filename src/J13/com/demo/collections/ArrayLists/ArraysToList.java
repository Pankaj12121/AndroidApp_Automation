package J13.com.demo.collections.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraysToList {
	public static void main(String[] args) {
		//create an array of type Object, in this case we will create String array
		String[] strArray = new String[]{"Object","Array","Converted","To","List"};
		List<String> list = Arrays.asList(strArray);
		//get an iterator
		Iterator<String> itr = list.iterator();

		//iterate through list created from Array
		System.out.println("List created from an Array of type Object contains,");
		while(itr.hasNext())
			System.out.println(itr.next());

	}
}