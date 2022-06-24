package com.demo.linkedinoops;

public class Encapsulation_Main {
	public static void main(String[] args) {
		Encapsulation_bankAccount eba = new Encapsulation_bankAccount("John", 100);

		eba.deposit(1000);
		eba.withdraw(400);
		eba.withdraw(300);

		System.out.println(eba.getBalance());
		System.out.println(eba.getOwner());
	}

}
