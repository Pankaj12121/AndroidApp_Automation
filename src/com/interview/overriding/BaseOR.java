package com.interview.overriding;

public class BaseOR {

	public void calculateIntrest(int a, int b) {

		int sum = a * b/100*10;
		System.out.println(sum);

	}

	public int sub(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
		return sum;
		
	}

}
