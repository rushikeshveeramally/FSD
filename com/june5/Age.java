package com.june5;

public class Age {
    int age = 2;


    void ageCheck(){
        if (age > 13 && age <= 19){
            System.out.println("teen");
        }

        else if (age<13){
            System.out.println("kid");
        }

        else if (age >19) {
            System.out.println("adult");
        }

        else {
            System.out.println("error");
        }
    }


    public static void main(String[] args) {

        Age age1 = new Age();
        age1.ageCheck();
    }

}
