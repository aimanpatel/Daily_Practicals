//Write a Java Program to count the number of words in a String without using the Predefined method?

package com.Lab16;
public class WordCount {
//Main methods for checking the word count...
	public static void main(String[] args) {
		String s1= "Welcome all of you in the class " 
				+"of java Programming ";
		//for deleting the extra spaces in the pgm...
		s1=s1.trim(); 
		int count=0;
		//condition for checking the total length of string....
		for(int i=0; i<s1.length();i++)
		{
			// Conditions for checking the index size of the letter and the spaces between them 
			// and checking the spaces after the characters....
			if(s1.charAt(i)==' ' && Character.isLetter(s1.charAt(i+1)) && (i>0))
			{
				count ++;
			}
		}
		//Printing the outputs.....
		System.out.println("No. of words : "+(count + 1));

	}

}
