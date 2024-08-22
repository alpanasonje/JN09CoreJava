package com.tns.daysix;

public class Student extends Person {
	private int rollNo;
	protected float marks;
	private String branch;
	static String ST;
	static final String TT;
	static {
		ST="Divya K";
		TT="Alpana Sonje";
		System.out.println("Static Block");
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String city) {
		super(name, city);
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, float marks, String branch) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.branch = branch;
	}
	public static void change()
	{
		ST="Divya Kalarical";
	}
	public static void display()
	{
		System.out.println("Softskill Trainer "+ST+"\tTechnical Trainer "+TT);
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [name ="+super.getName()+", City="+super.getCity()+", RollNo=" + rollNo + ", marks=" + marks + ", branch=" + branch + "]";
	}
	
}
