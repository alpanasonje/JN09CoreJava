package com.tns.daynine;

public class MyClass {
	public MyClass() {
		System.out.println("Constructor");
	}

	protected void finalize() throws Throwable {
		System.out.println("Destructor");
	}
}
