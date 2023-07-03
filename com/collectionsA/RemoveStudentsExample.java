package com.collectionsA;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", GPA: " + gpa;
    }
}

public class RemoveStudentsExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("rushikesh", "v", 3.5));
        studentList.add(new Student("java", "developer", 4.0));
        studentList.add(new Student("spring", "Boot", 2.8));
        studentList.add(new Student("UI", "Angular", 3.9));

        // Calculate average GPA
        double totalGpa = 0;
        for (Student student : studentList) {
            totalGpa += student.getGpa();
        }
        double averageGpa = totalGpa / studentList.size();


        studentList.removeIf(student -> student.getGpa() < averageGpa);


        System.out.println("Remaining students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
