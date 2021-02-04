package com.company.module_1.Lesson_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] users = new User[3];

        int count = 0;

        while (true) {
            System.out.println("[1] for Staff");
            System.out.println("[2] for Student");
            int choice1 = in.nextInt();
            if (choice1 == 1) {
                int id = count + 1;
                System.out.println("Insert name");
                String login = in.next();
                String password = in.next();
                String name = in.next();
                String surname = in.next();
                double salary = in.nextDouble();
                Staff staff = new Staff(id, login, password, name, surname, salary);
                users[count] = staff;



                for (int i = 0; i < count; i++) {
                    System.out.println("[1] Add subject");
                    System.out.println("[0] Exit");
                    int choice2 = in.nextInt();
                    if (choice2 == 1) {
                        System.out.println("choice = 1");
                        System.out.println("Insert subject");
                        String subject = in.next();
                        staff.addSubject(subject);
                        count ++;
                    } else {
                        System.out.println("Out");
                        break;
                    }
//                    System.out.println();
                }
                count++;


            } else if (choice1 == 2) {
                int id = count + 1;
                System.out.println(id);
                System.out.println("id" + id);
                System.out.println("log");
                String login = in.next();
                System.out.println("pas");
                String password = in.next();
                System.out.println("nam");
                String name = in.next();
                System.out.println("sur");
                String surname = in.next();
                System.out.println("gpa");
                double gpa = in.nextDouble();
                Student student = new Student(id, login, password, name, surname, gpa);
                users[count] = student;



                System.out.println("[1] Add Course");
                System.out.println("[0] Exit");
                int choice2 = in.nextInt();
                for (int i = 0; i < users.length; i++) {
                    if (choice2 == 1) {
                        System.out.println("choice = 1");
                        System.out.println("insert course");
                        String course = in.next();
                        student.addCourse(course);
                    } else if (choice2 == 0) {
                        System.out.println("Out");
                    } else {
                        break;
                    }
//                    System.out.println();
                }
                count++;
            }
            else{
                break;
                }
            }

            for (int i = 0; i < count; i++) {
                System.out.println(users[i].getData());

            }

        }


    }
