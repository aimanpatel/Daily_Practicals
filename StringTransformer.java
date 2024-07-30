//Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string

package com.Lab16;

public class StringTransformer {

    public static String transformString(String input) {
        // Check if the input string has at least 4 characters
        if (input.length() < 4) {
            throw new IllegalArgumentException("Input string must have at least 4 characters.");
        }

        // Get the substring that should be replaced with 'X'
        String prefix = input.substring(0, input.length() - 4);
        
        // Create a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Append 'X' characters for the prefix part
        for (int i = 0; i < prefix.length(); i++) {
            result.append('X');
        }

        // Append the last 4 characters from the original input
        result.append(input.substring(input.length() - 4));

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "12345678";
        String transformedString = transformString(input);
        System.out.println("Transformed String: " + transformedString);
    }
}
