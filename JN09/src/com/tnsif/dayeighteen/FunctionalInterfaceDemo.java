package com.tnsif.dayeighteen;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.tns.daynine.Student;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Consumer<Integer> obj = (n) -> System.out.println("Accepting : " + n);
		obj.accept(10);

		Consumer<Student> studentConsumer = (s) -> System.out.println("Student Details : " + s);

		Student s = new Student(11, "Mihir", 80);
		studentConsumer.accept(s);

		Supplier<String> supplier = () -> "Welcome";
		System.out.println(supplier.get());

		Predicate<Integer> oddPredicate = (n) -> n % 2 == 1;
		System.out.println("is 1 Odd? " + oddPredicate.test(1));
		System.out.println("is 10 Odd? " + oddPredicate.test(10));

		Predicate<Integer> primePredicate = (n) -> {
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		};
		System.out.println("is 10 Prime? " + primePredicate.test(10));

		System.out.println("is 11 Prime? " + primePredicate.test(11));

		Function<Integer, Double> sqrtFunction = (n) -> Math.sqrt(n);
		System.out.println("Square root of 5 = " + sqrtFunction.apply(5));
		System.out.println("Square root of 1225 = " + sqrtFunction.apply(1225));

		Function<String, Integer> vowelCount = (str) -> {
			int c = 0;
			for (int i = 0; i < str.length(); i++) {
				switch (str.charAt(i)) {
				case 'a':
				case 'A':
				case 'E':
				case 'e':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					c++;
					break;

				}
			}
			return c;
		};

		System.out.println("Vowel Count in Hello : " + vowelCount.apply("Hello"));
		System.out.println("Vowel Count in Java Programming : " + vowelCount.apply("Java Programming"));
		
		BiFunction<String, Character, Integer> occurrence=(str, ch)->
		{
			int c=0;
			for(int i=0;i<str.length();i++)
			{
				if (str.charAt(i)==ch)
					c++;
			}
			return c;
		};
		
		System.out.println("Occurence of l in Hello : " + occurrence.apply("Hello",'l'));
	}

}
