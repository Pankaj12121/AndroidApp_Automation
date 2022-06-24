package J13.com.demo.collections.ArrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListAppend {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("1");
		arrayList.add("2");
		arrayList.add("3");
		arrayList.add("java");
		Vector<String> v = new Vector<String>();
		v.add("4");
		v.add("5");
		arrayList.addAll(v);
		//insert all elements of Vector to ArrayList at index 1
		//  arrayList.addAll(1,v);
		System.out.println("After appending all elements of Vector, ArrayList contains..");
		for(int i=0; i<arrayList.size(); i++){
			System.out.println(arrayList.get(i));
		}
		//use hasNext() and next() methods of Iterator to iterate through the elements
		System.out.println("Iterating through ArrayList elements...");
		Iterator itr = arrayList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		System.out.println("Getting elements of ArrayList");
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
		
		arrayList.set(2,"Selenium");
		System.out.println(arrayList.get(2) + " is replaced for value 2");
		
		Object obj = arrayList.remove(1);
		System.out.println(obj + " is removed from ArrayList");
		
		System.out.println("Size of ArrayList before removing elements : "
				+ arrayList.size());
		arrayList.clear();
		System.out.println("Size of ArrayList after removing elements : "
				+ arrayList.size());

	}
}




