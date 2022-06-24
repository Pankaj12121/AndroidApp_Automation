package OP3.com.demo.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class LinkedAndSorted {

	public static void main(String[] args) {
		Set<String> list_Strings = new TreeSet<String>();
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);
		
		Map<String, Integer> certificationCost = new TreeMap<>(); 
		certificationCost.put("ISTQB", 7000); 
		certificationCost.put("CSTE", 11000); 
		certificationCost.put("ocjp", 18000);
		certificationCost.put("NSE", 2000); 
		certificationCost.put("Agile", 16000);
		System.out.println(certificationCost);

	}

}
