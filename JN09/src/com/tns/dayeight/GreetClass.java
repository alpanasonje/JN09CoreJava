package com.tns.dayeight;
public class GreetClass implements GreetInterface {

	@Override
	public String greet(String name) {
		
		return "Hello "+name;
	}

}
