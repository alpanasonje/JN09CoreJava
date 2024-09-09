package com.tnsif.dayeighteen;

public class UsingLambdaExp {

	public static void main(String[] args) {
		GreetInterface i = (String s) -> {
			return "Hello " + s;
		};
		System.out.println(i.greet("Students!!"));

		i = s -> "Welcome " + s;
		System.out.println(i.greet("Students!!"));
		
		PalindromeInterface<Integer> palindromeNumber=n->
		{
			int rev=0, dn=n;
			while(n!=0)
			{
				rev=rev*10+n%10;
				n=n/10;
			}
			return rev==dn;
		};
		
	System.out.println("Is 121 palindrome? "+	palindromeNumber.checkPalindrome(121));
	System.out.println("Is 122 palindrome? "+palindromeNumber.checkPalindrome(122));
	
	PalindromeInterface<String> palindromeString=s->
	{
		StringBuffer sb=new StringBuffer(s);
		String rev=sb.reverse().toString();
		return s.equals(rev);
	};

	System.out.println("Is CAR palindrome? "+	palindromeString.checkPalindrome("CAR"));
	System.out.println("Is RACECAR palindrome? "+palindromeString.checkPalindrome("RACECAR"));

	}

}
