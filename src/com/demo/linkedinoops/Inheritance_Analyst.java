package com.demo.linkedinoops;

public class Inheritance_Analyst extends Inheritance_Employee {

	public Inheritance_Analyst(String name, double salary, int age) {
		super(name, salary, age);

	}

	public double getAnnualBonus() {
		return super.salary * .05;
	}
}
