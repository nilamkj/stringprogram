package com.stringdemo;

public class AsciiValues {

	public static void main(String[] args) {
		
		String s1="hello";
		//s1=s1.toUpperCase();
		int i,len=s1.length();
		char ch;
		
		for(i=0;i<len;i++)
		{
			ch=s1.charAt(i);
			System.out.println(ch+" = "+(int)ch);
		}
	}

}
