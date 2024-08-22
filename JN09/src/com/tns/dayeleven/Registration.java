package com.tns.dayeleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Registration {
	static boolean validateAge(int age) throws AgeNotValidException
	{
		boolean flag=false;
		if (age<18 || age >50)
			throw new AgeNotValidException("Age should be between 18 and 50");
		else 
			flag=true;
		return flag;
	}
	public static void main(String[] args) {
		String name;
		String city;
		int age;
		
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name : ");
		name=br.readLine();
		System.out.println("Enter City : ");
		city=br.readLine();
		System.out.println("Enter Age : ");
		age=Integer.parseInt(br.readLine());
		if (validateAge(age))
			System.out.println("Valid age");
		}//try
		catch( IOException | AgeNotValidException e)
		{
			System.out.println(e.getMessage());
		} 

	}

}
