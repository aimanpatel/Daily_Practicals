//How to print duplicate characters from the String?

package com.Lab16;

public class DuplicateCharacters {

    public static void printDuplicates(String str) {
        // Assuming ASCII characters (0-255)
        int[] charCount = new int[256];

        // Convert the string to lowercase (if case insensitive comparison is needed)
        str = str.toLowerCase();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { // Only consider letters
                charCount[c]++;
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }

    public static void main(String[] args) {
        String inputString = "Hii We are in Java Session for The Web Development Course.....!";
        printDuplicates(inputString);
    }
}
