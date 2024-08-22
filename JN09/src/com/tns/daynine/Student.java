package com.tns.daynine;

import java.util.Objects;

public class Student {
	int rollNo;
	String name;
	float per;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, per, rollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Float.floatToIntBits(per) == Float.floatToIntBits(other.per)
				&& rollNo == other.rollNo;
	}
	
	
}
