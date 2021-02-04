package com.company.module_1.Lesson_8;

import java.util.Scanner;

public class Lesson_8_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Student [] students = new Student[3];
        int count = 0;

        for (int i = 0; i < students.length; i++){
        int id = count+1;
        String name = in.next();
        String surname = in.next();
        double gpa = in.nextDouble();
        students [i] = new Student(id,name,surname,gpa);
        count ++;
        }

        for (int i = 0; i < students.length; i++){
            System.out.println(students [i].getStudentData());
//            System.out.println(students [i].topStudent());
        }

    }
}
