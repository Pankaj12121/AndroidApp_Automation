package com.demo.generics;

public class Employee {
	public String name;
	public String id;
	public int contactNumber;

	public Employee(String name, String id, int contactNumber) {
		this.name = name;
		this.id = id;
		this.contactNumber = contactNumber;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

}
