//Program without exception handling
package com.tns.dayeleven;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter two nos");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Division is "+c);
		float r=13/2.0f;
		r=13/0.0f;
		System.out.println("Division is "+r);
		r=(float)a/0;
		System.out.println("Division is "+r);
System.out.println("---End---------");

	}

}
