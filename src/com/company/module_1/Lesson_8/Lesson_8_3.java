package com.company.module_1.Lesson_8;

import java.util.Scanner;

public class Lesson_8_3 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);


        Student[] students = new Student[20];

        int cnt = 0;

        while (true){

            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");

            int choice1 = in.nextInt();
            if (choice1 == 1){
                int id = cnt +1;
                System.out.println("Insert name");
                String n = in.next();
                System.out.println("Insert surname");
                String s = in.next();
                System.out.println("Insert GPA");
                double g = in.nextDouble();
                students[cnt] = new Student(id,n,s,g);
                cnt++;
            }
            else if (choice1 == 2){
                for (int i=0;i < cnt;i++){
                    System.out.println(students[i].getStudentData());
                }
            }
            else if (choice1 == 0){
                System.out.println("Out");
                break;
            }
            else {
                System.out.println("Action not exist");
            }
        }

    }
}
