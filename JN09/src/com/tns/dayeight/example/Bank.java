package com.tns.dayeight.example;

public interface Bank {
	public abstract void deposit(int amount);
	void withdraw(int amount);
	static final int MINIMUM_BALANCE=1000;
	int DEPOSIT_LIMIT=1000;
}
