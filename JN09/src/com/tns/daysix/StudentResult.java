package com.tns.daysix;

public class StudentResult extends Student {
	private String grade;

	public StudentResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentResult(int rollNo, float marks, String branch,String name,String city) {
		super(rollNo,marks,branch);
		super.setName(name);
		super.setCity(city);
		if(super.marks>=70)
		{
			this.grade = "First class";
		}
		else if(super.marks>=40) {
			
			this.grade = "Pass" ;
			
		}else {
			 this.grade = "fail";
		}
		 
	}

	@Override
	public String toString() {
		return "StudentResult [grade=" + grade + "]";
	}
	
	

	
}
