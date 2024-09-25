package com.bptn.course._05_strings;

public class Strings {

    public static void main(String[] args) {

        // Create a string
        String s = "Hello World";

        // Find the length of the string and store inside a varaible
        int stringLength = s.length();

        System.out.println("The length of the string is: " + stringLength);

        // Substring and store inside a variable
        String sub = s.substring(0, 8);

        System.out.println("The substring starting at 0 index and ending 1 index before index 8 is: " + sub);

        // Substring with start position without end position
        String sub2 = s.substring(3);
        System.out.println("The substring starting at 3 index and no ending position is: " + sub2);

        // Convert to lower case
        String sub3 = s.toLowerCase();
        System.out.println("The lower case string is: " + sub3);

        // Convert to upper case
        String sub4 = s.toUpperCase();
        System.out.println("The lower case string is: " + sub4);

        // Find the first occurrence of a substring using IndexOf
        int index = s.indexOf("World");
        System.out.println("The first occurrence of the substring is: " + index);

        // Find character at specified index
        char c = s.charAt(0);
        System.out.println("The character at index 0 is: " + c);

        // Reverse
        String reverseWord = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseWord += s.charAt(i);
        }
        System.out.println("Reverse Word is: " + reverseWord);

    }
}
