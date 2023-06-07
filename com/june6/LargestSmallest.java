package com.june6;

public class LargestSmallest {
    static void largesmall(int[] num)
    {
        int large = num[0];
        int small = num[0];

        for (int i = 1; i < num.length; i++)
        {
            if (num[i] > large) {
                large = num[i];
            }
            else if (num[i] < small) {
                small = num[i];
            }
        }

        System.out.println("The Largest array element is " + small);
        System.out.println("The smallest array element is " + large);
    }

    public static void main(String[] args) {
        int[] num = { 5, 7, 2, 4, 9, 6 };
        largesmall(num);
    }
}
