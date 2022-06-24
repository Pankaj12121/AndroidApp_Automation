package com.demo.abstraction.codechallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import net.sourceforge.htmlunit.corejs.javascript.ast.ForInLoop;

public class LinkedIN {
	static int counter = 0;
	static String valueR = "-";

	public static void main(String[] args) {
		binSearch() ;
		if (valueR != null || !valueR.contains("-"))
			System.out.println("pass");
		StringBuffer sb = new StringBuffer();
		sb.append("Pankaj\n");
		sb.append("Shri\n");
		sb.append("yogi\n");

		System.out.println(sb);
		String chk = "yes";
		String chk1 = new String("yes");
		String chk2 = new String("yes");
		System.out.println(chk.equals(chk1));
		System.out.println(chk == chk1);
		System.out.println(chk1 == chk2);
		System.out.println(chk2.equals(chk1));
		int[] num7 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] customers = new int[55];
		System.out.println(customers.length);
		System.out.println(customers[33]);
		int[] myArr = { 1, 2, 3, 4, 5 };
		arrayArt(myArr);
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i] + " ");

		}

		/*
		 * if (counter < 3) { counter++; main(null); } else { return; }
		 * System.out.println("hello World");
		 * 
		 */ booleanArt();
		String subStr = subStringArt();
		System.out.println(subStr);
		getStringFlag();
		arraylistArrayMemoryCompare();
		collectionSort();
		hashMapArt();
		swapArt();
		stringArt2();
		// errorArt();
		// errorArt2();
		objectArt();
		stringArt3();
		boolean isValidpwd = checkpassword("panka152");
		if (isValidpwd)
			System.out.println("Strong pwd");
		else
			System.out.println("weak pwd");

	}

	public static void booleanArt() {
		List<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("FalSe"));
		list.add(Boolean.TRUE);
		System.out.println(list.size());
		System.out.println(list.get(1) instanceof Boolean);
	}

	public static String subStringArt() {
		String fruit = "strawberries";
		String subStr = fruit.substring(2, 5);
		return subStr;

	}

	public static void getStringFlag() {
		if ("nifty".getClass().getSimpleName() == "String")
			System.out.println("its a string class");
		if ("nifty" instanceof String)
			System.out.println("its a string class");

	}

	public static void arrayListArt() {
		/*
		 * ArrayList<String>words= {"Hello","World"}; ArrayList
		 * words1=Arrays.asList("Hello"); ArrayList<String>words2= new ArrayList<>()
		 * {"Hello","World"};
		 */
		ArrayList<String> words3 = new ArrayList<>(Arrays.asList("Hello", "World"));

	}

	public static void arraylistArrayMemoryCompare() {
		String[] array = new String[] { "A", "B", "c" };
		List list1 = Arrays.asList(array);
		List list2 = new ArrayList<>(Arrays.asList(array));
		List list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));
		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
	}

	public static void collectionSort() {
		String[] array = { "abc", "2", "10", "0" };
		List<String> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Arrays.toString(array));
	}

	public static void hashMapArt() {
		HashMap<String, Integer> pantry = new HashMap<>();
		pantry.put("Apples", 3);
		pantry.put("Oranges", 2);

		int currentApples = pantry.get("Apples");
		pantry.put("Apples", currentApples + 4);
		System.out.println(pantry.get("Apples"));
	}

	public static void swapArt() {
		int x = 5, y = 10;
		swapsies(x, y);
		System.out.println(x + " " + y);
	}

	public static void swapsies(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void stringArt2() {
		String message = "Hello";
		print(message);
		message += "World!";
		print(message);

	}

	public static void print(String message) {
		System.out.print(message);
		message += " ";
	}

	public static void errorArt() {
		try {
			System.out.println("A");
			badMethod();
			System.out.println("B");
		} catch (Exception ex) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
	}

	public static void badMethod() {
		throw new Error();
	}

	public static void errorArt2() {
		String message = "Hello";
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i + 1));
		}
	}

	public static void objectArt() {
		List list = new ArrayList();
		list.add("hello");
		list.add(2);
		System.out.print(list.get(0) instanceof Object);
		System.out.print(list.get(1) instanceof Integer);
	}

	public String getContextView(AndroidDriver driver) {

		Set<String> contexts = new HashSet<>(driver.getContextHandles());
		for (String context : contexts) {
			return context;
		}

		return null;

	}

	public static void stringArt3() {
		String str = "abcde";
		str.trim();
		str.toUpperCase();
		str.substring(3, 4);
		System.out.println(str);
	}

	public static boolean returnflag(int value) {

		if (value % 2 == 0)
			return true;
		else
			return false;

		// best is return value%2==0

	}

	public static boolean checkpassword(String pass) {

		if (pass.length() < 6) {
			return false;
		}
		boolean hasLowercaseLetter = false;
		boolean hasUppercaseLetter = false;
		boolean hasNumber = false;
		for (int i = 0; i <= pass.length() - 1 || (!hasLowercaseLetter && !hasUppercaseLetter && !hasNumber); i++) {

			char current = pass.charAt(i);
			if (Character.isDigit(current)) {
				hasNumber = true;
			} else if (Character.isUpperCase(current)) {
				hasUppercaseLetter = true;

			} else if (Character.isLowerCase(current)) {
				hasLowercaseLetter = true;
			}

		}
		return hasNumber && hasLowercaseLetter && hasUppercaseLetter;
	}

	public static void arrayArt(int[] z) {

		z[0] = 0;

	}

	public static void binSearch() {
		List<Integer> fino = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34);
		System.out.println("Element found atindex in a list at: " + Collections.binarySearch(fino, 8));
		List<String> fino2 = Arrays.asList("1", "1", "2", "3", "5", "8", "13", "21", "34");
		System.out.println("Element found atindex in a list at: " + Collections.binarySearch(fino2, "8"));
	}

}
