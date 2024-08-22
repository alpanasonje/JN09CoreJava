package com.tns.dayfourteen;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Iterator;

import com.tns.daysix.Person;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> cityList = new LinkedList<String>();
		cityList.add("Nashik");
		cityList.add("Mumbai");
		cityList.add("Pune");
		cityList.add("Delhi");
		cityList.add("Bangalore");
		System.out.println(cityList);

		Collections.sort(cityList);
		System.out.println(cityList);
		System.out.println(cityList.getFirst());
		System.out.println(cityList.getLast());
		System.out.println(cityList.removeFirst());
		System.out.println(cityList.removeLast());
		cityList.addFirst("Kolkata");
		cityList.addLast("Nagpur");
		System.out.println(cityList);
		/*
		 * ListIterator<String> lit = cityList.listIterator(); while (lit.hasNext()) {
		 * System.out.println(lit.next()); }
		 */
		System.out.println("--------------------------------------");
		
		ListIterator<String> lit = cityList.listIterator(cityList.size());
		while (lit.hasPrevious()) {
			String city=lit.previous();
			System.out.println(city);
			if (city.equals("Nashik"))
				lit.set("Nashik City");
			if (city.equals("Kolkata"))
				lit.remove();
			if (city.equals("Nashik"))
				lit.add("Hyderabad");
		}
		System.out.println(cityList);

	}

}
