//Program to define Point class
package com.tns.dayfive;

public class Point {
	float x; //data member
	float y;
	Point()
	{
		//System.out.println("Default Constructor");
		//this() to be the first statement
	//	x=0.0f;
	//	y=0.0f;
		this(0.0f,0.0f);
		System.out.println("Default Constructor");
	}
	Point(float value)
	{
		//x=value;
		//y=value;
		this(value,value);
	}
	Point(float x, float y) //local variable
	{
		this.x=x; //resolve the ambiguity
		this.y=y;
	}
	public void show()
	{
		//this(); //not allowed in method
		System.out.println("Point("+x+", "+y+")");
	}
	public static void display()
	{
		//this.x=10; 
		//System.out.println(x);
	//	show(); non static members not allowed
	}
	public Point change()
	{
		x++;
		this.show();
		return this; //returns current object
	}
	
}
