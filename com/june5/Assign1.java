package com.june5;

public class Assign1 {
    public static void main(String[] args) {
            int n = 12345, rev = 0;
                while(n != 0)
                {
                int remainder = n % 10;
                rev = rev * 10 + remainder;
                n = n/10;
                  }
            System.out.println(rev);
        }

}
