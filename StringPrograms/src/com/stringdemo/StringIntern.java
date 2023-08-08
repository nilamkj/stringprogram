package com.stringdemo;

public class StringIntern {

	public static void main(String[] args) {
		String s1=new String("abc");
		
		String s2=s1.intern();
		
		System.out.println(s1==s2);
		
		///////////////////////////
		
		String s3="xyz";
		String s4=new String("xyz");
		String s5=s4.intern();
		System.out.println(s3==s5);
		
		//for faster comparision
		String str1=new String ("hello");
		String str2=new String("hello");
		System.out.println(str1==str2);
		System.out.println(str1.intern()==str2.intern());

	}

}
