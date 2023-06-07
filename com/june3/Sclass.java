package com.june3;

public class Sclass {
    public static int svar;

    static int m1(int a){
        svar = a;
        return svar;
    }

    public static void main(String[] args) {

        System.out.println(Sclass.m1(5));


    }
}
