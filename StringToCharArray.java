//Write a program to Convert String to Character Array.

package com.Lab18;

public class StringToCharArray {
    public static void main(String[] args) {
        String inputString = "I am a Java developer...!!!";

        // Convert string to char array
        char[] charArray = inputString.toCharArray();

        // Print each character in the char array
        System.out.println("Original String: " + inputString);
        System.out.print("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println(); // Print a new line
    }
}
