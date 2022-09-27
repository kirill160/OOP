package com.company.OOP;

public class Main {
    public static void main(String[] args) {
        final int size = 2;
        Student [] students = new Student[size];
        Student s1 = new Student("Иван", "Иванов", 2121,4.5);
        Aspirant s2 = new Aspirant("Егор", "Иванов", 2123,4.8);
        students[0] = s1;
        students[1] = s2;
        Student q1 = new Aspirant("Igor", "Bichukov", 22,4.0);
        System.out.println(q1.getScholarship());
        for (Student s: students) {
            System.out.println(s);
            System.out.println("grant=" + s.getScholarship());
        }
        }
    }

