package com.tnsif.dayseventeen;

public class GenericArray<T extends Comparable<T>> implements ArrayInterface<T> {
	T items[];

	@Override
	public void printArray(T[] items) {
		for (T element : items)
			System.out.print(element + "\t");
		System.out.println();
	}

	@Override
	public void readArray(T[] items) {
		this.items = items;
	}

	@Override
	public void sortArray() {
		int n=items.length;
		T temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (items[i].compareTo(items[j])>0)
				{
					temp=items[i];
					items[i]=items[j];
					items[j]=temp;
				}
					
			}
		}

	}

	@Override
	public boolean search(T[] items, T element) {
		for(T e: items)
		{
			if (e.equals(element))
				return true;
		}
		return false;
	}

}
