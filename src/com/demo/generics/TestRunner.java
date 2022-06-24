package com.demo.generics;

public class TestRunner {

	public static void main(String[] args) {
		Person<Employee> e1 = new Person<>();
		Person<Contact> c1 = new Person<>();

		Employee e = new Employee("Pankaj", "152", 2321244);
		Contact c = new Contact("Akola", "Gorakshan", 411019);
		
		e1.setPerson(e);
		c1.setPerson(c);
		
		System.out.println(e1.getPerson().toString());
		System.out.println(c1.getPerson().toString());

	}
}
