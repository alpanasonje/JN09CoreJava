package com.tns.dayeleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
	static int divide(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		int a, b, c;
		try {
			System.out.println("enter two nos");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = divide(a, b);
			System.out.println("Division is " + c);
			
			String s="Hello";
			System.out.println(s.charAt(3));
		}
		/*
		 * catch (Exception e) { System.out.println(e); }
		 */
		catch (ArithmeticException | InputMismatchException e) { // | Exception e) {
			System.out.println("Error... " + e);
		}
		/*
		 * catch (InputMismatchException e) { System.out.println("Invalid Input " + e);
		 * }
		 */

		catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("-----");
	}

}
