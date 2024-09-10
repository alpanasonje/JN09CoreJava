package com.tnsif.dayseventeen;

public class Demo {

	public static void main(String[] args) {
		MyGenericClass<Integer> obj=new MyGenericClass<Integer>(10);
		System.out.println(obj);
		
		MyGenericClass<Float> floatObj=new MyGenericClass<Float>(10.20f);
		System.out.println(floatObj);
		
		MyGenericClass<String> stringObj=new MyGenericClass<String>("Hello");
		System.out.println(stringObj);

	}

}
