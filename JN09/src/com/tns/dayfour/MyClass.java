package com.tns.dayfour;

public class MyClass {
	private int privateNo;
	public int publicNo;
	protected int protectedNo;
	int defaultNo;
	
	public MyClass()
	{
		privateNo=1;
		defaultNo=11;
		protectedNo=101;
		publicNo=1001;
	}

	@Override
	public String toString() {
		return "MyClass [privateNo=" + privateNo + ", publicNo=" + publicNo + ", protectedNo=" + protectedNo
				+ ", defaultNo=" + defaultNo + "]";
	}
	
}
