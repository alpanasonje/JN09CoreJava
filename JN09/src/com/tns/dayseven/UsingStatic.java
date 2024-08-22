package com.tns.dayseven;

public class UsingStatic {
	private int no; // instance variable
	private static int staticNo; // static variable
	private static final int staticConstant=999; // static constant
	private final int constantNo=9999;
	static {
		staticNo = 11;
	//	staticConstant = 101; initialize either at the time of declaration
								//or within static block
	}

	public UsingStatic() {
	//	constantNo = 1001; initialize either at the time of declaration
		//or within Constructor
	}

	public UsingStatic(int n) {
		//constantNo = n; initialize either at the time of declaration
		//or within Constructor
	}
	void change()
	{
		no++;
		staticNo++;
		//staticConstant++; constants can't modify
		//constantNo++; constants can't modify
	}
	
	static void show()
	{
		System.out.println(staticConstant);
		System.out.println(staticNo);
		//non static members cannot accessible in static context
		//System.out.println(no);
		//System.out.println(constantNo);
		//change();
		//this.no++; 
		//super.toString();
	}

	@Override
	public String toString() {
		change();
		return "UsingStatic [staticConstant="+staticConstant+", staticNo="+staticNo+", no=" + no + ", constantNo=" + constantNo + "]";
	}

}
