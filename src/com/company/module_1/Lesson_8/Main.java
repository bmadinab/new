package com.company.module_1.Lesson_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student[] students = new Student[5];
        int cnt = 0;

        for (int i = 0; i < students.length; i++) {
            int id = cnt +1;
            String n = in.next();
            String s = in.next();
            double g = in.nextDouble();
            students[i] = new Student(id,n,s,g);
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            System.out.println(students[i].getStudentData());
        }
    }

}

