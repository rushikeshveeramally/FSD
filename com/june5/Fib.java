package com.june5;

public class Fib {
    static void fib(int x)
    {
        int n1 = 0, n2 = 1;

        int count = 0;


        while (count < x) {

            System.out.print(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            count = count + 1;
        }
    }
    public static void main(String args[])
    {
        int x = 10;
        fib(x);
    }
}
