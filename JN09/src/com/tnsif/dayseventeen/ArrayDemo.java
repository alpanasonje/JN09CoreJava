package com.tnsif.dayseventeen;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ArrayDemo {

	public static void main(String[] args) {
		GenericArray<Integer> intArray = new GenericArray<Integer>();
		Integer a[] = { 90, 10, 50, 20, 80, 40 };
		intArray.readArray(a);
		intArray.printArray(a);
		System.out.println("Is 50 present? : " + intArray.search(a, 50));
		System.out.println("Is 150 present? : " + intArray.search(a, 150));
		intArray.sortArray();
		intArray.printArray(a);
		
		String[] cities = { "Nashik", "Pune", "Mumbai", "Bangalore", "Delhi", "Chennai", "Hyderabad" };
		GenericArray<String> stringArray = new GenericArray<String>();
		stringArray.readArray(cities);
		stringArray.printArray(cities);
		System.out.println("Is 'Delhi' present? : " + stringArray.search(cities, "Delhi"));
		System.out.println("Is 'Nagpur' present? : " + stringArray.search(cities, "Nagpur"));
		stringArray.sortArray();
		stringArray.printArray(cities);
		
		Student[] studArray=new Student[5];
		studArray[0]=new Student(15, "Pooja", 67);
		studArray[1]=new Student(11, "Nikita", 86);
		studArray[2]=new Student(8, "Mahesh", 62);
		studArray[3]=new Student(25, "Dipali", 66);
		studArray[4]=new Student(85, "Sonali", 71);
		
		GenericArray<Student> studObject=new GenericArray<Student>();
		studObject.readArray(studArray);
		studObject.printArray(studArray);
		System.out.println(studObject.search(studArray, new Student(85, "Sonali", 71)));
		studObject.sortArray();
		studObject.printArray(studArray);
			
		
	}

}
