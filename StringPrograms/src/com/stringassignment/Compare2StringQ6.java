package com.stringassignment;
//6. Write a Java program to compare two strings.
public class Compare2StringQ6 {

	public static void main(String[] args) {
		String s1=new String("nilam");
		String s2=new String("Shivani");
		int b=s1.compareTo(s2);
		System.out.println("b= "+b);
		if(b==0)
		{
			System.out.println("both Strings are equal");
		}
		else
		{
			System.out.println("both Strings are not equal");
		}

	}

}
