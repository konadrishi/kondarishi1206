

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.getLastName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class sortNameFromCvs {
    public static void main(String[] args) throws IOException {
        String fileName = "students.csv";
        List<Student> studentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(Stud.csv))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String firstName = data[0];
                String lastName = data[1];
                double gpa = Double.parseDouble(data[2]);

                Student student = new Student(firstName, lastName, gpa);
                studentList.add(student);
            }

            Collections.sort(studentList);

            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
