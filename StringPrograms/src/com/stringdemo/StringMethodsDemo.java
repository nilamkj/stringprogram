package com.stringdemo;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String s1="hello ,hii";
		String s2="WELCOME";
		
		s1.toUpperCase();
		System.out.println(s1);//hello
		
		//case 1
		System.out.println(s1.toUpperCase());//HELLO
		
		//case 2
		s1=s1.toUpperCase();
		System.out.println(s1);//HELLO
		
		String s3=s2.toLowerCase();
		System.out.println(s3);//welcome
		
		//length()-how many char are present
		int len=s1.length();
		System.out.println("length of s1:"+len);
		System.out.println("length of s2:"+s2.length());
		
		//charAt(int index);
		//charAt ch1=s1.charAt(1);
		//char ch1=s1.charAt(10);   //java.lang.StringIndexOutOfBoundsException: String index out of range: 10
		//char ch1=s1.charAt('a');   // java.lang.StringIndexOutOfBoundsException: String index out of range: 97
		//char ch1=s1.charAt(s1.length());// java.lang.StringIndexOutOfBoundsException: String index out of range: 10
		char ch1=s1.charAt(s1.length()-1);
		//char ch2=s1.charAt(len-1);  // java.lang.StringIndexOutOfBoundsException: String index out of range: -1
		char ch3=s1.charAt(-1);
		System.out.println("char present at index 1 is "+ch1);
		
	}

}
