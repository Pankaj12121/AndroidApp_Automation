package com.demo.abstraction.codechallenge;

public abstract class B extends A{
	@Override
	void firstMethod() {
		System.out.println("FIRST");

		thirdMethod();
	}

	abstract void thirdMethod();
}
