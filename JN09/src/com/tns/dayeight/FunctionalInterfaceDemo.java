package com.tns.dayeight;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
	GreetClass obj=new GreetClass();
	System.out.println(obj.greet("Students"));

	
	GreetInterface objOne=(s)->{ return "Good Afternoon "+s;};
	System.out.println(objOne.greet("Students"));
	
	objOne=(s)-> "Hello "+s+" How are you?";
	System.out.println(objOne.greet("Students"));
	}

}
