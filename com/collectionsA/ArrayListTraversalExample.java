package com.collectionsA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversalExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("java");
        stringList.add("full");
        stringList.add("stack");
        stringList.add("Developer");

        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }

        // Using iterator
        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Using forEach
        System.out.println("\nUsing forEach:");
        stringList.forEach(System.out::println);

        // Using parallel stream
        System.out.println("\nUsing parallel stream:");
        stringList.parallelStream().forEach(System.out::println);


        //After removal



        System.out.println("After removal");

        System.out.println( stringList.remove(stringList.size()-1) + " is removed");

        System.out.println("array list after removing last element is"+stringList);


        //converting arraylist to array

        System.out.println("converting arraylist to array");

        String[] stArray = stringList.toArray(new String[0]);

        for (String e : stArray){
            System.out.println(e);
        }

        System.out.println(stArray);



    }
}
