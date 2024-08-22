package com.tns.daynine;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student(1, "Ankit", 56);
		System.out.println(s1.hashCode());
		Student s2=new Student(1, "Ankit", 56);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
		MyClass m=new MyClass();
		m=null;
		System.gc();

	}

}
