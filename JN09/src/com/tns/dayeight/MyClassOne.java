package com.tns.dayeight;

public class MyClassOne implements MyInterface {

	@Override
	public void calculate(int n) {
		int f=1;
		for(int i=1;i<=n;i++)
			f=f*i;
		System.out.println("Factorial is "+f);

	}

}
