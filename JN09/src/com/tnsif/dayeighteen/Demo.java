package com.tnsif.dayeighteen;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperations r =(a,b) -> a+b;
		System.out.println(r.calculate(100, 20));
		
		r = (a,b) -> a-b;
		System.out.println(r.calculate(100, 20));
		
		r = (a,b) -> a*b;
		System.out.println(r.calculate(100, 20));
		
		r = (a,b) -> a/b;
		System.out.println(r.calculate(100, 20));

	}

}
