package com.tns.daynine;

public class StringDemo {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		String s5=s1;
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));
		String s6=new String(s1);
		System.out.println(s6==s5);
		System.out.println(s6.equals(s5));
		String s7="HELLO";
		System.out.println(s1==s7);
		System.out.println(s1.equalsIgnoreCase(s7));
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.indexOf("i"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("i"));
		s1="        Hello    ";
		System.out.println(s1+" : "+s1.length());
		s1=s1.trim();
		System.out.println(s1+" : "+s1.length());
		s1="Hello How are you?";
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(6,9));
		
		StringBuffer sb=new StringBuffer(s1);
		sb.append(" ");
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		
	}
	
	
	
	

}
