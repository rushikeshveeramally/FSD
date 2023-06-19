package com.day1415;

public class AverageOfOddSquares {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 9, 6, 1};

        double average = calculateAverageOfOddSquares(arr);
        System.out.println("Average of squares of odd numbers: " + average);
    }

    public static double calculateAverageOfOddSquares(int[] arr) {
        int count = 0;
        int sum = 0;

        for (int num : arr) {
            if (num % 2 != 0) { // Check if the number is odd
                int square = num * num;
                sum += square;
                count++;
            }
        }

        if (count == 0) {
            return 0; // To handle the case when there are no odd numbers in the array
        }

        return (double) sum / count;
    }
}

