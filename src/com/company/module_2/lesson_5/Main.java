package com.company.module_2.lesson_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList <Student> students = new ArrayList<>();

        while (true){

            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENTS");
            System.out.println("PRESS [0] TO EXIT");

            int choice  = in.nextInt();

            if (choice == 1){
                System.out.println("PRESS [1] TO ADD STUDENT");
                String name = in.next();
                String surname = in.next();
                ArrayList<Subject> subjects = new ArrayList<>();

                while (true) {
                    System.out.println("PRESS [1] TO ADD SUBJECT");
                    System.out.println("PRESS [0] TO GO TO MAIN MENU");
                    int choice2 = in.nextInt();
                    if (choice2 == 1) {
                        String subject_name = in.next();
                        int credits = in.nextInt();
                        Subject subject = new Subject(subject_name, credits);
                        subjects.add(subject);
                    }
                    else if (choice2 == 0){
                        break;
                    }
                    else{
                        break;
                    }
                }
//                System.out.println("student");
                Student student = new Student (name,surname);
                student.setSubjects(subjects);
                students.add(student);
                try{
                    ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("src/com/company/module_2/lesson_4/memo.dat"));
                    outStream.writeObject(students);
                    outStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
//                System.out.println("student2");
            }
            else if (choice == 2){
                System.out.println("PRESS [2] TO LIST STUDENTS");
                try{
                    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/com/company/module_2/lesson_4/memo.dat"));
                    System.out.println(inputStream.readObject());
                    inputStream.close();
//                    System.out.println("Inputstream close");
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            else {
                break;
            }

        }
    }

}
