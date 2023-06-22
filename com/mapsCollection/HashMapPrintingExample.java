package com.mapsCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Student {
    private final String firstName;
    private final String lastName;
    private final double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", GPA: " + gpa;
    }
}

public class HashMapPrintingExample {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("John", new Student("rushikesh", "java", 3.5));
        studentMap.put("Alice", new Student("java", "rushikesh", 4.0));
        studentMap.put("Bob", new Student("angular", "js", 2.8));
        studentMap.put("Emma", new Student("react", "js", 3.9));
        studentMap.put("Sarah", new Student("vue", "js", 3.2));
        studentMap.put("Michael", new Student("js", "vue", 3.7));
        studentMap.put("Emily", new Student("ext", "js", 3.6));
        studentMap.put("David", new Student("j2ee", "jee", 3.4));

        // Printing using EntrySet
        System.out.println("Printing using EntrySet:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            String key = entry.getKey();
            Student student = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + student);
        }

        // Printing using map's forEach method
        System.out.println("\nPrinting using map's forEach method:");
        studentMap.forEach((key, student) -> System.out.println("Key: " + key + ", Value: " + student));

        // Printing using keySet and Iterator
        System.out.println("\nPrinting using keySet and Iterator:");
        Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Student student = studentMap.get(key);
            System.out.println("Key: " + key + ", Value: " + student);
        }
    }
}
