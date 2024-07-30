//Write a program replace a Substring in a String

package com.Lab18;

public class SubstringReplace {
    public static void main(String[] args) {
        String originalString = "In this World we are humans!";
        String substringToReplace = "World";
        String replacementString = "Universe";

        // Replace substring
        String modifiedString = originalString.replace(substringToReplace, replacementString);

        // Print original and modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
