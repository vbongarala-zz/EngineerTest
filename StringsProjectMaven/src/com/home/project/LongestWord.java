package com.home.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LongestWord {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//take string input from user
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		LongestWord obj = new LongestWord();
		if(str.length()>0){
			System.out.println("You entered String:" + str);
			//invoke findLongestWord method
			List<String> longestWord = obj.findLongestWord(str);
			//print the longest word and its length\
			System.out.println("Longest words are : ");
			for(String word : longestWord)
			{
				System.out.println(word);
			}
			String word = longestWord.get(0);
			System.out.println(longestWord + " is the longest word with " + word.length() + " characters");
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
	public List<String> findLongestWord(String str) {
		List<String> longestWords=null;
		int maxLength=Integer.MIN_VALUE;
		if(str == null || str.length()==0)
		{
			return new ArrayList<String>();
		}
		
		//Tokenizing the input using space
		String[] words = str.trim().split(" ");
		longestWords=new ArrayList<String>();
		String longestWord = "";
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].length() > maxLength)
			{
				maxLength=words[i].length();
				longestWords.clear();
				longestWords.add(words[i]);
				
			}
			else if(words[i].length() == maxLength){
				longestWords.add(words[i]);
			}
		}
		return longestWords;
	}

}