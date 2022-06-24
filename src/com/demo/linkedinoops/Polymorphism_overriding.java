package com.demo.linkedinoops;

import java.util.ArrayList;
import java.util.Arrays;

public class Polymorphism_overriding extends ArrayList<Integer> {
	
	
	@Override
	public void add(int index, Integer element) {
		if (isOdd(element))
			super.add(index, element);
	}

	@Override
	public boolean add(Integer element) {
		if (isOdd(element)) {
			return super.add(element);
		} else {
			return false;
		}

	}

	@Override
	public Integer set(int index, Integer element) {
		if (isOdd(element)) {
			return super.set(index, element);
		} else {
			System.out.println(element + " is not odd");
			return Integer.MIN_VALUE;
		}
	}

	public static boolean isOdd(Integer element) {
		return Math.abs(element) % 2 == 1;

	}

}
