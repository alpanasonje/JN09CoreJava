package com.tnsif.dayseventeen;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

	public static void main(String[] args) {
		UsingWildCard<Integer> obj=new UsingWildCard<Integer>();
		obj.show(10);
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);l.add(2);
		obj.show1(l);
		obj.show2(l);
		
		UsingWildCard<Float> obj1=new UsingWildCard<Float>();
		obj1.show(10.45f);
		List<Float> l1=new ArrayList<Float>();
		l1.add(1.5f);l1.add(2.6f);
		obj1.show1(l1);
		obj1.show2(l1);
		
		
		UsingWildCard<String> obj2=new UsingWildCard<String>();
		obj2.show("Generics");
		List<String> s=new ArrayList<String>();
		s.add("Hi");s.add("Hello");
		obj2.show1(s);
		obj2.show2(s);

		UsingWildCard<Student> obj3=new UsingWildCard<Student>();
		obj3.show(new Student(1, "Amit", 56));

	}

}
