//program to demonstrate constructor overloading
package com.tns.dayfive;

public class PointDemo {
	public static void main(String[] args) {
		Point p;
		p=new Point();
		p.show();
		
		Point p1=new Point(2.5f);
		p1.show();
		
		Point p2=new Point(10,45.4f);
		p2.show();
		p2.change();
		p2.show();
	}
}
