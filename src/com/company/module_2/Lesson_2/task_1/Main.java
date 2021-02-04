package com.company.module_2.Lesson_2.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] users = new User[5];

        for (int i = 0; i < users.length; i++) {
            String name = in.next();
            String surname = in.next();
            int age;
            try {
                age = in.nextInt();
            } catch (Exception e) {
                age = 0;
                e.printStackTrace();
            }
            users[i] = new User(name, surname, age);
        }
        double sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum  += users[i].getAge();
        }
        System.out.println(sum/5);

    }
}
