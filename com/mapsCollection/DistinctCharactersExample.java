package com.mapsCollection;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharactersExample {
    public static void main(String[] args) {
        String input = "RUSHIKESH JAVA FULL STACK DEVELOPER";

        // Create a HashMap to store character counts
        Map<Character, Integer> charCounts = new HashMap<>();

        // Iterate over the string and count the characters
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCounts.containsKey(c)) {
                // Increment the count if the character is already present in the map
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                // Add the character to the map with count 1 if it's encountered for the first time
                charCounts.put(c, 1);
            }
        }

        // Print the distinct characters and their counts
        System.out.println("Distinct characters and their counts:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
