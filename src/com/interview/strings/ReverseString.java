package com.interview.strings;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReverseString {
	public static String revString= "I lives in Mumbai";
	public static void main(String[] args) {
		reverseStringUsingCharArrayForEachLoop(revString);
		reverseStringUsingCollection(revString);
		replaceStringChar();
		reverseWordinString();
		
	}
	
	//reverse using char array 
	public static void reverseStringUsingCharArrayForEachLoop(String str) {
		char[] cn = str.toCharArray(); 
		for(int i=cn.length-1;i>=0;i--) {
			System.out.print(cn[i]);
		}
	}
	//reverse using collection
	public static void reverseStringUsingCollection(String str) {
		System.out.println("");
		char[] cn = str.toCharArray();
		List<Character> cnlist = new LinkedList<>();
		for (char c : cn) {
			cnlist.add(c);
		}
		Collections.reverse(cnlist);
		ListIterator<Character> li=cnlist.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next());
		}
	}
	// replace a word in string
	public static void replaceStringChar() {
		String replacedStr= revString.replace("I", "We");
		System.out.println();
		String subs=(String) replacedStr.subSequence(0, 8);
		System.out.println(subs);
		System.out.println(replacedStr);
	}
	//	Reverse each word in a String
	
	public static void reverseWordinString() {
		String[] strArray=revString.split(" ");
		StringBuffer stf= new StringBuffer();
		for(String word:strArray) {
			stf.append(word).reverse();
			stf.append(" ");
		}
		System.out.println(stf.toString());
	}
}
