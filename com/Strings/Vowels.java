package com.Strings;

public class Vowels {

    public static void main(String args[]){
        int count = 0;

        String sentence = "rushikesh is a java developer";

        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence is "+count);
    }

}
