package com.stringassignment;
//3. Compare string using new operator when new is present see different reference is there
public class CompareString3 {

	public static void main(String[] args) {
		String s1=new String("b");
		String s2=new String("N");
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
