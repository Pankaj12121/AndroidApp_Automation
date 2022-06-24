package com.demo.linkedinoops;

public class Inheritance_Employee {

	protected String name;
	protected double salary;
	protected int age;

	public Inheritance_Employee(String name, double salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public void raiseSalary() {
		this.salary = this.salary * 1.2;
	}

}
