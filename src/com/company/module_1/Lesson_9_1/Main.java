package com.company.module_1.Lesson_9_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User [] users = new User[5];
        int count = 0;
        System.out.println("1 for Staff");
        System.out.println("2 for Student");
        System.out.println("0 for quit");

        while (true) {
            int choice1 = in.nextInt();
            if (choice1 == 1) {
                int id = count + 1;
                String login = in.next();
                String password = in.next();
                String name = in.next();
                String surname = in.next();
                double salary = in.nextDouble();
                Staff staff = new Staff(id, login, password, name, surname, salary);
                users[count] = staff;

                System.out.println("insert subject");
                for (int i = 0; i < count; i++) {
                    String subject = in.next();
                    staff.addSubject(subject);
                }

                count ++;
            }
            else {
                break;
            }

            for (int i = 0; i < count; i++){
                System.out.println(users[i].getData());
                User user = new User();
                if (user instanceof Staff) {

                }

            }


        }

    }
}
