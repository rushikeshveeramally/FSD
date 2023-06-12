package com.Strings;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Csv implements Comparable<Csv>{
    String firstname;
    String lastname;

    double gpa;

    public Csv(String firstname, String lastname, double gpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
    }

    public String toString() {
        return "{" + "firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", gpa=" + gpa + '}';
    }

    @Override

    public int compareTo(Csv that) {
        return this.lastname.compareTo(that.lastname);
    }
    public static void main(String[] args) {

        List<Csv> b = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\WORK\\CIS_JAVA\\FSD\\com\\Strings\\MOCK_DATA.csv"))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");
                String firstName = data[0].trim();
                String lastName = data[1].trim();
                double gpa = Double.parseDouble(data[2].trim());

                Csv a = new Csv(firstName, lastName, gpa);
                b.add(a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Collections.sort(b);
        for (Csv x : b)
            System.out.println(x.toString());

    }

}
