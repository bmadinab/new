package com.company.module_2.Lesson_2.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Book [] books = new Book[3];
        int count = 0;

        for (int i = 0; i < books.length; i++){
            int id = 0;
               try {
                   id = in.nextInt();
               }catch (Exception e){
                   System.out.println("Введите числовой id");
                   e.printStackTrace();
               }
            String name = in.next();
            String author = in.next();
            books [count] = new Book(id, name, author);

        }
        for (int i = 0; i < books.length; i++){

        }
        System.out.println(books [count].getData());
        System.out.println(books[count].printBooks());

    }
}
