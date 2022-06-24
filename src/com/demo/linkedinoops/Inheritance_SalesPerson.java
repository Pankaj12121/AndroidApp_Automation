package com.demo.linkedinoops;

public class Inheritance_SalesPerson extends Inheritance_Employee {
	double commisionPercentage;

	public Inheritance_SalesPerson(String name, double salary, int age, double commmisionPercentage) {
		super(name, salary, age);
		this.commisionPercentage = commmisionPercentage;

	}

	public double getCommisionPercentage() {
		return this.commisionPercentage;
	}

	public void raiseCommision() {
		if (this.commisionPercentage < .30) {
			this.commisionPercentage = this.commisionPercentage * 1.2;
		}
	}
}
