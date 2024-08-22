package com.tns.dayeight.example;

public class BankDemo {

	public static void main(String[] args) {
		Account acc1=new Account(1, "Amit", 67000);
		System.out.println(acc1);
		acc1.deposit(34000);
		System.out.println(acc1);
		acc1.withdraw(50000);
		System.out.println(acc1);

	}

}
