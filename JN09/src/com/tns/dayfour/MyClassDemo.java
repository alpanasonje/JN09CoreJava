package com.tns.dayfour;

public class MyClassDemo {
	public static void main(String[] args) {
		MyClass obj=new MyClass();
		System.out.println(obj);
		obj.publicNo++;
		obj.defaultNo++;
		obj.protectedNo++;
		//obj.privateNo++; not accessible outside the class
		System.out.println(obj);
	}
}
