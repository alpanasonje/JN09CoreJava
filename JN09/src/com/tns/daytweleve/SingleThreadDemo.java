package com.tns.daytweleve;

public class SingleThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Operations.getFactorial(5));
		System.out.println("Is 5 prime? "+Operations.checkPrime(5));
		System.out.println("Is 1324 is palindrome? "+Operations.checkPalindrome(1324));
		System.out.println("Is 12321 is palindrome? "+Operations.checkPalindrome(12321));
		
		Runnable r=()->{
			System.out.println("Is RACECAR palindrome? "+Operations.checkPalindrome("RACECAR"));
			Operations.generateFibonacci();			
		};
		
		Thread t=new Thread(r);
		t.start();
		System.out.println("----------END OF MAIN-----------");
	}

}
