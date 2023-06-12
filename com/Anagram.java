package com.Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "rushikesh";
        String str2 = "keshrushi";

        boolean areAnagrams = checkIfAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }

    public static boolean checkIfAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
