package com.tnsif.daynineteen;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(10, 21, 30, 101, 40, 83, 60);
		intStream.forEach(n -> System.out.println(n));
		System.out.println("------------------");

		intStream=Stream.of(10, 21, 30, 101, 40, 83, 60);
		Consumer<Integer> obj = (n) -> System.out.println("Accepting : " + n);
		intStream.forEach(obj);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101, 30, 40, 83, 60);
		intStream.forEach(System.out::println);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		System.out.println("Total Numbers  : "+intStream.count());
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		intStream=intStream.limit(10);
		intStream.forEach(System.out::println);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		intStream=intStream.skip(4);
		intStream.forEach(System.out::println);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		intStream=intStream.distinct();
		intStream.forEach(System.out::println);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		intStream=intStream.filter(n->n%2==0);
		intStream.forEach(System.out::println);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		Predicate<Integer> evenPredicate=n->n%2==0;
		intStream=intStream.filter(evenPredicate);
		intStream.forEach(System.out::println);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		intStream=intStream.map(n->n*2);
		intStream.forEach(System.out::println);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		Function<Integer, Integer> twice=n->n*2;
		intStream=intStream.map(twice);
		intStream.forEach(System.out::println);
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		Optional<Integer> sum=intStream.reduce((a,b)->a+b);
		System.out.println("Sum of all elements "+sum.get());
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		Optional<Integer> max=intStream.reduce((a,b)->a>b?a:b);
		System.out.println("Maximum of all elements "+max.get());
		System.out.println("------------------");
		
		intStream=Stream.of(10, 21, 30, 101,30, 40, 83, 60);
		Optional<Integer> min=intStream.reduce((a,b)->a<b?a:b);
		System.out.println("Minimum of all elements "+min.get());
		System.out.println("------------------");
		
	}

}
