package com.tnsif.dayseventeen;

public class MyGenericClass<T> {
	//generic data member
	T dataMember;

	//generic constructor
	public MyGenericClass(T dataMember) {
		super();
		this.dataMember = dataMember;
	}

	//generic methods
	public T getDataMember() {
		return dataMember;
	}

	public void setDataMember(T dataMember) {
		this.dataMember = dataMember;
	}

	@Override
	public String toString() {
		return "MyGenericClass [dataMember=" + dataMember + "]";
	}
	
	
	

}
