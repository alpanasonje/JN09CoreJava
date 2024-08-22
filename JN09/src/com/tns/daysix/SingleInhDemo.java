package com.tns.daysix;

public class SingleInhDemo {

	public static void main(String[] args) {
		Person p=new Person("Tanmay", "Chalisgaon");
		Student s=new Student(1, 67, "CS");
		s.setName("Tanmay");
		s.setCity("Chalisgaon");
		System.out.println(p);
		System.out.println("------------------");
		System.out.println(s);
		
		Student s1=new Student("Pratik", "Nashik");
		s1.setRollNo(2);
		s1.setMarks(81);
		s1.setBranch("CS");
		System.out.println(s1);

	}

}

