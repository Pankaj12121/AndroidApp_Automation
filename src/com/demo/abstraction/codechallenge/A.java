package com.demo.abstraction.codechallenge;

public abstract class A {
	abstract void firstMethod();

	void secondMethod() {
		System.out.println("SECOND");

		firstMethod();
	}
}



//First
//Third
//Second
//First
//Third
//Third