package com.com.collections;


import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();

        // Add 10 strings to the HashSet
        name.add("rushikesh");
        name.add("java");
        name.add("fullstack");
        name.add("developer");
        name.add("angular");
        name.add("react");
        name.add("spring");
        name.add("boot");
        name.add("microservies");
        name.add("JSON");

        System.out.println("using Iterator:");
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("\nusing ForEach loop:");
        for (String element : name) {
            System.out.println(element);
        }

        System.out.println("\nusing Streams forEach:");
        name.stream().forEach(System.out::println);
    }
}