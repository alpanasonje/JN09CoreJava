package com.tns.dayeight;

public class Demo {

	public static void main(String[] args) {
		MyInterface m;
		//interfaces cannot be instantiated
		//m=new MyInterface();
		m=new MyClass();
		m.calculate(5);
		
		m=new MyClassOne();
		m.calculate(5);
		
	

	}

}
