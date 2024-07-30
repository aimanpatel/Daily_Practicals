// Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.

package com.Lab17;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        
        String result = removeVowels(input);
        
        System.out.println("String after removing vowels: " + result);
    }
    
    public static String removeVowels(String input) {
        // Using StringBuilder to efficiently manipulate strings
        StringBuilder result = new StringBuilder();
        
        // Convert the input string to lowercase to handle both uppercase and lowercase vowels
        String lowercaseInput = input.toLowerCase();
        
        for (int i = 0; i < lowercaseInput.length(); i++) {
            char ch = lowercaseInput.charAt(i);
            
            // Append to result only if the character is not a vowel
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result.append(input.charAt(i));
            }
        }
        
        return result.toString();
    }
}
