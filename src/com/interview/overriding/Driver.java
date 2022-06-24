package com.interview.overriding;

public class Driver {

	public static void main(String[] args) {

		BaseOR obj = new BaseOR();
		BaseOR obj1 = new ExtendedOR();
		obj.calculateIntrest(10, 20);
		obj1.calculateIntrest(10, 20);

	}

}
