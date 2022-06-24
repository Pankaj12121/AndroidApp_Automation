package OP3.com.demo.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println(list_Strings);
		/*-----------------------------------Itreator list ---------------------------*/
		List<String> list_StringsItr = new ArrayList<String>();
		list_StringsItr.add("Red");
		list_StringsItr.add("Green");
		list_StringsItr.add("Orange");
		list_StringsItr.add("White");
		list_StringsItr.add("Black");
		// Print the list
		for (String element : list_StringsItr) {
			System.out.println(element);
		}

		/*----------------------------------insert an element in first and last position---------------*/
		// Creae a list and add some colors to the list
		List<String> list_StringsPostion = new ArrayList<String>();
		list_StringsPostion.add("Red");
		list_StringsPostion.add("Green");
		list_StringsPostion.add("Orange");
		list_StringsPostion.add("White");
		list_StringsPostion.add("Black");
		// Print the list
		System.out.println(list_StringsPostion);
		// Now insert a color at the first and last position of the list
		list_StringsPostion.add(0, "Pink");
		list_StringsPostion.add(5, "Yellow");
		// Print the list
		System.out.println(list_StringsPostion);
		/* -------------------------------------to retrive the element----------------------------*/

		List<String> list_StringsRetrive = new ArrayList<String>();
		list_StringsRetrive.add("Red");
		list_StringsRetrive.add("Green");
		list_StringsRetrive.add("Orange");
		list_StringsRetrive.add("White");
		list_StringsRetrive.add("Black");
		// Print the list
		System.out.println(list_StringsRetrive);
		// Retrive the first and third element
		String element = list_StringsRetrive.get(0);
		System.out.println("First element: "+element);
		element = list_StringsRetrive.get(2);
		System.out.println("Third element: "+element);

		/*----------------------------------to Update the element----------------------------------- */

		List<String> list_StringsUpdate = new ArrayList<String>();
		list_StringsUpdate.add("Red");
		list_StringsUpdate.add("Green");
		list_StringsUpdate.add("Orange");
		list_StringsUpdate.add("White");
		list_StringsUpdate.add("Black");
		// Print the list
		System.out.println(list_StringsUpdate);
		// Update the third element with "Yellow"
		list_StringsUpdate.set(2, "Yellow");
		// Print the list again
		System.out.println(list_StringsUpdate);

		/*-------------------------------to remove the element-----------------------------------*/

		List<String> list_StringsRemove = new ArrayList<String>();
		list_StringsRemove.add("Red");
		list_StringsRemove.add("Green");
		list_StringsRemove.add("Orange");
		list_StringsRemove.add("White");
		list_StringsRemove.add("Black");
		// Print the list
		System.out.println(list_StringsRemove);
		// Remove the third element from the list.
		list_StringsRemove.remove(2);
		// Print the list again
		System.out.println("After removing third element from the list:\n"+list_StringsRemove);

		/* ------------------------search an element in a list------------------------------*/

		List<String> list_StringsSearch = new ArrayList<String>();
		list_StringsSearch.add("Red");
		list_StringsSearch.add("Green");
		list_StringsSearch.add("Orange");
		list_StringsSearch.add("White");
		list_StringsSearch.add("Black");
		// Search the value Red
		if (list_StringsSearch.contains("Red")) {
			System.out.println("Found the element");
		} else {
			System.out.println("There is no such element");
		}

		/*    --------------------------sort the list---------------------------------*/

		List<String> list_StringsSort = new ArrayList<String>();
		list_StringsSort.add("Red");
		list_StringsSort.add("Green");
		list_StringsSort.add("Orange");
		list_StringsSort.add("White");
		list_StringsSort.add("Black");
		System.out.println("List before sort: "+list_StringsSort);
		Collections.sort(list_StringsSort);
		System.out.println("List after sort: "+list_StringsSort);  

		/*   -----------------------copy list1 to list2---------------------------------------*/
		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List1: " + List1);
		List<String> List2 = new ArrayList<String>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		System.out.println("List2: " + List2);
		// Copy List1 to List2
		Collections.copy(List1, List2);
		System.out.println("Copy List to List2,\nAfter copy:");
		System.out.println("List1: " + List1);
		System.out.println("List2: " + List2);

		/*---------------------------shuffle the list--------------------------------------*/

		List<String> list_StringsShuffle = new ArrayList<String>();
		list_StringsShuffle.add("Red");
		list_StringsShuffle.add("Green");
		list_StringsShuffle.add("Orange");
		list_StringsShuffle.add("White");
		list_StringsShuffle.add("Black");
		System.out.println("List before shuffling:\n" + list_StringsShuffle);  
		Collections.shuffle(list_StringsShuffle);
		System.out.println("List after shuffling:\n" + list_StringsShuffle); 
		/*----------------Reverse the collection-----------------------------------------------------*/
		List<String> list_StringsReverse = new ArrayList<String>();
		list_StringsReverse.add("Red");
		list_StringsReverse.add("Green");
		list_StringsReverse.add("Orange");
		list_StringsReverse.add("White");
		list_StringsReverse.add("Black");
		System.out.println("List before reversing :\n" + list_StringsReverse);  
		Collections.reverse(list_StringsReverse);
		System.out.println("List after reversing :\n" + list_StringsReverse); 

		/*---------------------Sub portion of the list-------------------------------------------- */
		List<String> list_StringsSubPortion = new ArrayList<String>();
		list_StringsSubPortion.add("Red");
		list_StringsSubPortion.add("Green");
		list_StringsSubPortion.add("Orange");
		list_StringsSubPortion.add("White");
		list_StringsSubPortion.add("Black");
		System.out.println("Original list: " + list_StringsSubPortion);
		List<String> sub_List = list_StringsSubPortion.subList(0, 3);
		System.out.println("List of first three elements: " + sub_List);

		/* ----------------------compare two arrayList---------------------------------------------- */
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");

		ArrayList<String> c2= new ArrayList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");

		//Storing the comparison output in ArrayList<String>
		ArrayList<String> c3 = new ArrayList<String>();
		for (String e : c1)
			c3.add(c2.contains(e) ? "Yes" : "No");
		System.out.println(c3);

		/* ------------------------------swap elements in the arrayList--------------------------- */  
		ArrayList<String> s1= new ArrayList<String>();
		s1.add("Red");
		s1.add("Green");
		s1.add("Black");
		s1.add("White");
		s1.add("Pink");

		System.out.println("Array list before Swap:");
		for(String a: s1){
			System.out.println(a);
		}
		//Swapping 1st(index 0) element with the 3rd(index 2) element
		Collections.swap(s1, 0, 2);
		System.out.println("Array list after swap:");
		for(String b: s1){
			System.out.println(b);
		}
		/*----------------------join two arraylist-------------------------------------------- */ 
		ArrayList<String> k1= new ArrayList<String>();
		k1.add("Red");
		k1.add("Green");
		k1.add("Black");
		k1.add("White");
		k1.add("Pink");
		System.out.println("List of first array: " + k1);
		ArrayList<String> k2= new ArrayList<String>();
		k2.add("Red");
		k2.add("Green");
		k2.add("Black");
		k2.add("Pink");
		System.out.println("List of second array: " + k2);

		// Let join above two list
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(k1);
		a.addAll(k2);
		System.out.println("New array: " + a);
		/*-----------------------------clone the arrayList------------------------------------------ */ 

		ArrayList<String> l1= new ArrayList<String>();
		l1.add("Red");
		l1.add("Green");
		l1.add("Black");
		l1.add("White");
		l1.add("Pink");
		System.out.println("Original array list: " + l1);
		ArrayList<String> newc1 = (ArrayList<String>)l1.clone();
		System.out.println("Cloned array list: " + newc1);   

		/*------------------------------Empty ArrayList----------------------------------------------*/ 
		ArrayList<String> e1= new ArrayList<String>();
		e1.add("Red");
		e1.add("Green");
		e1.add("Black");
		e1.add("White");
		e1.add("Pink");
		System.out.println("Original array list: " + e1);
		e1.removeAll(e1);
		System.out.println("Array list after remove all elements "+e1); 
		if(e1.isEmpty())
			System.out.println("ArrayList is empty");
		else
			System.out.println("ArrayList is not empty");
	}
}


