package com.exceptions;

class Sec extends RuntimeException {
    public Sec(String message) {
        super(message);
    }
}

public class Second {
    public static void main(String[] args) {
        try {
            int result = Addition("10", "250A");
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {

            throw new Sec("Invalid input: " + e.getMessage());
        } catch (Sec e) {

            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    public static int Addition(String num1, String num2) {
        int operand1 = Integer.parseInt(num1);
        int operand2 = Integer.parseInt(num2);
        return (operand1 + operand2);
    }
}