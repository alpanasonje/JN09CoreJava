package com.tnsif.dayseventeen;

import java.util.List;

public class UsingWildCard<T> {
	public void show(T data) {
		System.out.println(data);
		System.out.println("Type : "+data.getClass().getName());
	}
	public void show1(List<? extends Number> data) {
		System.out.println(data);
		System.out.println("Type : "+data.getClass().getName());
	}
	public void show2(List<? super Integer> data) {
		System.out.println(data);
		System.out.println("Type : "+data.getClass().getName());
	}
}
