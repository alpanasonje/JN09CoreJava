package com.tns.daytweleve;

public class Operations {
	public static int getFactorial(int n)
	
	{
		int res = 1;
		for(int i = 1 ; i <= n ; i++) {
			if(n == 0 || n == 1) {
				return 1;
			}
			res *= i;
		}
		return res;
	}
	
	public static boolean checkPalindrome(int no) {
		int originalNumber = no;
		int reversedNumber = 0;
		while (no>0)
		{
		  int digit=no%10;
		  reversedNumber=reversedNumber*10+digit;
		  no /=10;
		}
		 return originalNumber == reversedNumber;
	}
	public static boolean checkPalindrome(String name)
	{
		int left = 0;
		int right = name.length()-1;
	 	
		while(left<right) {
			if(name.charAt(left)!=name.charAt(right)) {
				return false;
			}
			left++;
			right--;
			
		}
		return true;
	}
	public static boolean checkPrime(int n)
	{
		for (int i=2;i<n;i++)
		{
			if(n%i == 0)
				return false;
			
		}
		return true;
	}
	public static void generateFibonacci()
	{
		int n1=0, n2=1,n,i,count=10;
		System.out.println(n1+ " " +n2);
		for (i=2;i<count;++i)
		{
			n=n1+n2;
			System.out.println(" "+n);
			n1=n2;
			n2=n;
		}
	}
}
