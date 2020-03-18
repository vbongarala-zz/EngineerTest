package com.home.project;
import java.util.Scanner;
public class LongestWord {

	public static void main(String[] args) {
		
		//take string input from user
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		LongestWord obj = new LongestWord();
		//invoke findLongestWord method
		String longestWord = obj.findLongestWord(str);
		if(longestWord.length()>0){
			//print the longest word and its length
			System.out.println("You entered String ::" + str);
			System.out.println(longestWord + " is the longest word with " + longestWord.length() + " characters");
		}
		else{
			System.out.println("Entered string is empty");
		}
		
	}

	/**
	 * @param str
	 * @param longestWord
	 * @return longestWord
	 */
	public String findLongestWord(String str) {
		if(str == null || str.length()==0)
		{
			return "";
		}
		
		String[] words = str.split(" ");
		String longestWord = "";
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].length() >= longestWord.length())
			{
				longestWord = words[i];
			}
		}
		return longestWord;
	}

}
