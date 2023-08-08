package com.stringassignment;
//10. Write a Java program to find first occurrence of a character in a given string.
//11. Write a Java program to count occurrences of a character in given string
public class FirstOccuranceOfChar {
	
	public static void firstOccuranceOfChar(String s)
	{
		int len=s.length();
		
		int index=s.indexOf("m");
		System.out.println("First occurrance of character in given string: "+index);
	}
	
	public static void countOccurancesOfChar(String s1)
	{
		int len=s1.length();
		int count=0;
		//int index1=s1.indexOf("i");
		for(int i=0;i<len;i++)
		{
			if(s1.charAt(i)=='i')
			count++;
		}
		System.out.println("Occurrances of character in given string: "+count);

	}

	public static void main(String[] args) {
		String s="i love my india";
		firstOccuranceOfChar(s);
		countOccurancesOfChar(s);
		
	}

}
