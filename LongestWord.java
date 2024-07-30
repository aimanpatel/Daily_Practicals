// Write a program in Java to enter a String/Sentence and display the longest word and the length of the longest word present in the String.

package com.Lab17;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string/sentence: ");
        String input = sc.nextLine();
        
        String[] words = input.split("\\s+"); // Split the input string by whitespace
        
        String longestWord = "";
        int maxLength = 0;
        
        // Iterate through each word to find the longest one
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        
        // Output the longest word and its length
        System.out.println("The longest word: " + longestWord);
        System.out.println("The length of the word: " + maxLength);
    }
}
