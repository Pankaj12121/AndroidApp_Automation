package OP3.com.demo.assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMaPExample {

	public static void main(String args[]) {
		Map<String, Integer> certificationCost = new HashMap<>(); 
		certificationCost.put("ISTQB", 7000); 
		certificationCost.put("CSTE", 11000); 
		certificationCost.put("ocjp", 18000);
		certificationCost.put("NSE", 2000); 
		certificationCost.put("Agile", 16000);
		// let's try to remove element from Hashmap using Map.remove(Object key) method // this will not work, will throw ConcurrentModfiicationException 
		Set<String> setOfCertifications = certificationCost.keySet(); 
		// Map - before removing a mapping System.out.println("before: " + certificationCost); // let's use Iterator to remove a key from HashMap while iterating 
		Iterator<String> iterator = setOfCertifications.iterator();//certificationCost.keySet().iterator(); 
		while(iterator.hasNext()){ 
			String certification = iterator.next(); 
			if(certification.contains("OCMJEA")){ 
				iterator.remove(); 
			}
		} // Map - after removing a mapping 
		System.out.println("after: " + certificationCost); 


		/*-------------Associate specific value with the specific key----------------------------------*/

		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		System.out.println("The Size of hashMap is "+hash_map.size());// to get the size of hashMap
		for(Map.Entry x:hash_map.entrySet()){  
			System.out.println(x.getKey()+" "+x.getValue());  
		} 
		/*---------copy from one map to another map------------------------------------------------*/

		HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
		HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		// populate hash maps
		hash_map1.put(1, "Red");
		hash_map1.put(2, "Green");
		hash_map1.put(3, "Black");
		System.out.println("\nValues in first map: " + hash_map1);
		hash_map2.put(4, "White");
		hash_map2.put(5, "Blue");
		hash_map2.put(6, "Orange");
		System.out.println("\nValues in second map: " + hash_map2);

		// put all values in secondmap
		hash_map2.putAll(hash_map1);
		System.out.println("\nNow values in second map: " + hash_map2);
		hash_map2.clear(); // To clear all the mapping from hashmap
		System.out.println("size of second map: " + hash_map2);
		// check if map is empty
		boolean result = hash_map2.isEmpty();// to check whether hashmap is empty or not
		// check the result
		System.out.println("Is hash map empty: " + result);
		/*---------------------------------hashMap clone---------------------------------------------- */ 
		HashMap<Integer,String> hash_mapClone= new HashMap<Integer,String>();  
		hash_mapClone.put(1, "Red");
		hash_mapClone.put(2, "Green");
		hash_mapClone.put(3, "Black");
		hash_mapClone.put(4, "White");
		hash_mapClone.put(5, "Blue");
		// print the map
		System.out.println("The Original map: " + hash_mapClone);
		HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		new_hash_map = (HashMap)hash_mapClone.clone();     
		System.out.println("Cloned map: " + new_hash_map); 
		/*------------------------hashMap key mapping-------------------------------------------------  */ 
		HashMap < String, Integer > hash_mapKM = new HashMap < String, Integer > ();
		hash_mapKM.put("Red", 1);
		hash_mapKM.put("Green", 2);
		hash_mapKM.put("Black", 3);
		hash_mapKM.put("White", 4);
		hash_mapKM.put("Blue", 5);
		// print the map
		System.out.println("The Original map: " + hash_mapKM);
		System.out.println("1. Is key 'Green' exists?");
		if (hash_mapKM.containsKey("Green")) {
			//key exists
			System.out.println("yes! - " + hash_mapKM.get("Green"));
		} else {
			//key does not exists
			System.out.println("no!");
		}

		System.out.println("\n2. Is key 'orange' exists?");
		if (hash_mapKM.containsKey("orange")) {
			System.out.println("yes! - " + hash_mapKM.get("orange"));
		} else {
			System.out.println("no!");
		}
		/*--------------------------------------Create a set view of the mapping---------------*/
		HashMap < Integer, String > hash_mapSet = new HashMap < Integer, String > ();
		hash_mapSet.put(1, "Red");
		hash_mapSet.put(2, "Green");
		hash_mapSet.put(3, "Black");
		hash_mapSet.put(4, "White");
		hash_mapSet.put(5, "Blue");
		// create set view for the map
		Set set = hash_mapSet.entrySet();
		// check set values
		System.out.println("Set values: " + set);
		/*----------------------------------value of Specified key-----------------------*/
		HashMap<Integer,String> hash_mapSP= new HashMap<Integer,String>();  
		hash_mapSP.put(1,"Red");
		hash_mapSP.put(2,"Green");
		hash_mapSP.put(3,"Black");
		hash_mapSP.put(4,"White");
		hash_mapSP.put(5,"Blue");
		// get value of key 3
		String val=(String)hash_mapSP.get(3); 
		// check the value
		System.out.println("Value for key 3 is: " + val);
		// checking collection view of the map
		 System.out.println("Collection view is: "+ hash_mapSP.values());
	} 
}
