package J14.com.demo.collections.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {

		//create HashMap object
		HashMap<String,String> hMap = new HashMap<String,String>();

		hMap.put("1","One");
		hMap.put("2","Two");
		hMap.put("3","Three");

		/*
	      get Set of keys contained in HashMap using
	      Set keySet() method of HashMap class
		 */

		Set<String> st = hMap.keySet();

		System.out.println("Set created from HashMap Keys contains :");
		//iterate through the Set of keys
		Iterator<String> itr = st.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		/*
	       Please note that resultant Set object is backed by the HashMap.
	       Any key that is removed from Set will also be removed from
	       original HashMap object. The same is not the case with the element
	       addition.
		 */

		//remove 2 from Set
		st.remove("2");

		//check if original HashMap still contains 2
		boolean blnExists = hMap.containsKey("2");
		System.out.println("Does HashMap contain 2 ? " + blnExists);
	}
}


