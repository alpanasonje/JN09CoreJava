package com.tns.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.tns.daysix.Person;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Heterogeneous list
		/*
		 * ArrayList list=new ArrayList(); list.add(10); list.add("TNSIF");
		 * list.add("Nashik"); list.add(20); list.add(true); list.add(45.78);
		 * System.out.println(list); Collections.sort(list); System.out.println(list);
		 */

		// Homogeneous
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		// numberList.add("TNSIF");
		numberList.add(20);
		numberList.add(40);
		numberList.add(100);
		numberList.add(50);
		System.out.println(numberList.add(40));
		numberList.add(100);
		// numberList.add(true);
		// numberList.add(45.78);
		System.out.println(numberList);
		Collections.sort(numberList);
		System.out.println(numberList);

		System.out.println("First Element : " + numberList.get(0));
		System.out.println("Last Element : " + numberList.get(numberList.size() - 1));
		System.out.println("Is 34 present? " + numberList.contains(34));
		System.out.println("Is 100 present? " + numberList.contains(100));
		System.out.println("first occurrence of 40 at " + numberList.indexOf(40));
		System.out.println("last occurrence of 40 at " + numberList.lastIndexOf(40));
		System.out.println(numberList.indexOf(400));

		numberList.add(1, 500);
		System.out.println(numberList);
		System.out.println(numberList.remove(5)); // removed element at 5 position
		// System.out.println(numberList.remove(20));
		System.out.println(numberList.remove(numberList.indexOf(20)));
		System.out.println(numberList);

		System.out.println("--------------------------");
		int sum = 0;
		for (Integer n : numberList) {
			sum += n;
		}
		System.out.println("Sum of elements " + sum);
		System.out.println("--------------------------");
		Iterator<Integer> it = numberList.iterator();
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n + " : " + Math.sqrt(n));
			if (n == 40)
				it.remove();
		}
		System.out.println("--------------------------");
		System.out.println(numberList);
		numberList.clear();
		System.out.println(numberList);

		System.out.println("--------------------------");
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("Nashik");
		cityList.add("Mumbai");
		cityList.add("Pune");
		cityList.add("Delhi");
		cityList.add("Bangalore");
		System.out.println(cityList);

		Collections.sort(cityList);
		System.out.println(cityList);

		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Amit", "Nagpur"));
		personList.add(new Person("Sumit", "Pune"));
		personList.add(new Person("Lalit", "Delhi"));
		personList.add(new Person("Ankit", "Nashik"));
		System.out.println(personList);
		Comparator<Person> comp=(p2, p1)->p1.getName().compareTo(p2.getName());
		Collections.sort(personList,comp);
		System.out.println(personList);
	
	}

}
