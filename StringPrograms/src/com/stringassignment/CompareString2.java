package com.stringassignment;
//2. Compare string using == when “” is present see same reference is there

public class CompareString2 {

	public static void main(String[] args) {
		String s1="a";
		String s2="A";
		int a=s1.compareTo(s2);
		System.out.println("a= "+a);
		if(a==0)
		{
			System.out.println("both Strings are equal");
		}
		else
		{
			System.out.println("both Strings are not equal");
		}

	}

}
