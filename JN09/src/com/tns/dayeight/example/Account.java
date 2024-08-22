package com.tns.dayeight.example;

public class Account implements Bank {
	int accNo;
	String name;
	int balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		if (amount>DEPOSIT_LIMIT)
			System.out.println("Deposit limit exceeded...");
		else
			balance+=amount;

	}

	@Override
	public void withdraw(int amount) {
		if (balance-amount<MINIMUM_BALANCE)
			System.out.println("Cannot Withdraw");
		else
			balance-=amount;

	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
