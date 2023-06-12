package com.Strings;

public class ReverseEachClass {
    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }

    public static void main(String[] args) {
        System.out.println(ReverseEachClass.reverseWord("my name is RUSHIKESH"));

    }
}















