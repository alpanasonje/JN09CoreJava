package com.tnsif.dayseventeen;

public interface ArrayInterface <T extends Comparable<T>> {

	void printArray(T items[]);

	void readArray(T items[]);

	void sortArray();

	boolean search(T items[], T element);

}
