package com.stringassignment;

import java.util.Scanner;

//14. Write a Java program to find first occurrence of a word in a given string.

public class FirstOccuranceOfWord {
	
	public static void firstOccuranceOfWord(String s)
	{
		String str="", word="";
		int wordsLen, i, count = 0;
		

		String words[] = str.split(" ");
		wordsLen = words.length;

		for (i = 0; i < wordsLen; i++) {
			if (word.equals(words[i]))
				count++;
		}

		System.out.println("\nTotal Occurrences = " + count);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		System.out.print("\nEnter a Word to Find its Occurrence: ");
		String word = sc.next();
		firstOccuranceOfWord(word);
	}

}
