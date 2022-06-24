package com.demo.generics;

public class Person<E> {
	public E e;

	public E getPerson() {
		return e;
	}

	public void setPerson(E e) {
		this.e = e;
	}

}
