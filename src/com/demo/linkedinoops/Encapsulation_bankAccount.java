package com.demo.linkedinoops;

public class Encapsulation_bankAccount {
	private String owner;
	private double balance;

	public Encapsulation_bankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = Math.max(balance, 0);

	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public double deposit(double amt) {
		if (amt > 0) {
			this.balance = this.balance + amt;
			return balance;
		}
		return 0;
	}

	public double withdraw(double amt) {
		if (amt < this.balance) {
			this.balance = this.balance - amt;
			return balance;

		}
		return 0;
	}

}
