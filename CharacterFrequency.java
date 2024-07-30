//Write a program to print the frequency of each character in a String

package com.Lab18;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Hi world Iam a java programmer...";
        
        // Create an array to count frequency of characters
        int[] freq = new int[256]; // Assuming ASCII characters
        
        // Traverse the string and count frequencies
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        
        // Print frequencies of characters
        System.out.println("Character frequencies in '" + str + "':");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println("'" + (char)i + "' : " + freq[i]);
            }
        }
    }
}
