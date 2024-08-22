package com.tns.dayseven;

import com.tns.daysix.Student;

public class StaticDemo {

	public static void main(String[] args) {
		Student.display();
		Student s1=new Student(1,67,"CS");
		Student s2=new Student(2,71,"IT");
		System.out.println(s1);
		System.out.println(s2);
		Student.change();
		Student.display();
		//s1.display();
		//s2.display();
		
		System.out.println("-------------------");
		UsingStatic obj1=new UsingStatic();
		UsingStatic obj2=new UsingStatic(2001);
		
		System.out.println(obj1);
		System.out.println(obj2);
		obj1.change();
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
