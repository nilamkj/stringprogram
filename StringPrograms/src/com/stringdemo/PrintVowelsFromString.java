package com.stringdemo;

public class PrintVowelsFromString {

	public static void testAllVowelsFromString(String s)
	{
		int i,len=s.length();
		char ch;
		
		for(i=0;i<len;i++)
		{
			ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch+" is vowel");
			}
			else 
				System.out.println(ch+" is not vowel");
		}
	}
	public static void printAllVowels(String s)
	{
		int i,len=s.length();
		char ch;
		
		for(i=0;i<len;i++)
		{
			ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch+" is vowel");
			}
			
		}
	}
	public static void main(String[] args) {
			String s1="welcome";
			
			testAllVowelsFromString(s1);
			System.out.println("-------Print vowels-------");
			printAllVowels(s1);
			
	}

}
