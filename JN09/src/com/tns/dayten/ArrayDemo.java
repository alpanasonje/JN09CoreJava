package com.tns.dayten;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[], x; // a is an array where x is single integer
		int[] c;
		int[] b, y; // b and y both are arrays

		x = 10;
		// y=20;
		a = new int[5];
		// index loop
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("-------------------");
		a = new int[10];
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println("--------------");

		//for..each loop
		for (int n : a)
			System.out.print(n + "\t");
		
		a[0]=12;
		a[1]=44;
		a[2]=21;
		a[3]=67;
		a[4]=15;
		System.out.println(a[0]);
		//for..each loop
		for (int n : a)
		System.out.print(n + "\t");
		Arrays.sort(a);
		System.out.println("---Sorted Array---");
		for (int n : a)
			System.out.print(n + "\t");
		
		String names[]= {"Java", "C++", "DotNET"};
		System.out.println(names.length);
		for(String s:names)
			System.out.println(s);
		//Jagged array
		System.out.println("---------------------");
		int arr[][]= {{1, 2}, {4,6,8,9}, {3,7,5},{10}};
		System.out.println("Rows "+arr.length);
		
		//index loop
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
		
		//for..each
		for(int[] m:arr)
		{
			for(int n: m)
				System.out.print(n+"\t");
			System.out.println();
		}
	}

}
