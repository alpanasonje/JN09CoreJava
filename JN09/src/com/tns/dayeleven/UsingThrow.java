package com.tns.dayeleven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UsingThrow {
	public static void main(String[] args) {
		int a,b,c;
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two nos");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		if (b==0)
			throw new ArithmeticException();
		else
			c=a/b;
		
		}//try
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println("Error in Reading from file");
		}
				
	}//main
	
}//class
