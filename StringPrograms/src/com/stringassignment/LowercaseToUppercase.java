package com.stringassignment;
//7.WAP to convert lowercase string to uppercase
public class LowercaseToUppercase {

	public static void main(String[] args) {
		String s1="i learn java programs";
		s1=s1.toUpperCase();
		int i,len=s1.length();
		
		for(i=0;i<len;i++)
		{
			System.out.print(s1.charAt(i));
		}
	}

}
