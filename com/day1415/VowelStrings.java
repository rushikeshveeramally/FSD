package com.day1415;

public class VowelStrings {
    public static void main(String[] args) {
        String[] arr = {"Hello", "RUSHIKESH", "java", "FULLSTACK", "DEVELOPER"};

        containsvowels(arr);
    }

    public static void containsvowels(String[] arr) {
        for (String str : arr) {
            int numVowels = countVowels(str);
            if (numVowels > 0) {
                System.out.println("String: " + str);
                System.out.println("Number of vowels: " + numVowels);
                System.out.println();
            }
        }
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}

