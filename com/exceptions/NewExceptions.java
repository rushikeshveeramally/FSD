package com.exceptions;

public class NewExceptions {
    public static int convertStringToInt(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"123", "456", "789", "abc", "9999", "123456789"};

        for (String input : inputs) {
            try {
                int result = convertStringToInt(input);
                System.out.println("Input: " + input + " | Output: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Input: " + input + " | Exception: " + e.getMessage());
            }
        }
    }
}

