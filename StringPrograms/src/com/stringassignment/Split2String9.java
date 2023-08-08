package com.stringassignment;
//9. WAP to split string into 2 tokens where string is “HELLO$WORLD”

public class Split2String9 {

	public static void main(String[] args) {
		String s1="HELLO$WORLD";
				
		String arr[]=s1.split("\\$");
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}
