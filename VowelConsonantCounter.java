//How do you count a number of vowels and consonants in a given string?

package com.Lab16;

public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String str) {
        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert string to lowercase
        str = str.toLowerCase();
        
        // Iterate through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        // Print the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String inputString = "Today is very heavy Raining in our area......!";
        countVowelsAndConsonants(inputString);
    }
}
