package com.stringdemo;

public class SplitMethod {

	public static void main(String[] args) {
		String s1="rose:is:red";
		char ch[]=s1.toCharArray();
		
		System.out.println("Character Array");
		for(char c:ch)
		{
			System.out.println(c);
		}
		
		/////////////////////////
		
		String sarr[]=s1.split(":");
		for(String s:sarr)
		{
			System.out.println(s);
		}

	}

}
