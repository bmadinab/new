package com.company.module_2.lesson_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        DBManager db = new DBManager();
        db.connect();

        while(true){

            System.out.println("[1] ADD DOG");
            System.out.println("[2] LIST DOGS");
            System.out.println("[3] UPDATE DOG");
            System.out.println("[0] EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert ID");
                int id = in.nextInt();
                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert age: ");
                int age = in.nextInt();
                System.out.println("Insert weight: ");
                double weight = in.nextDouble();

                //Именно поэтому мы и сделали Long id. Чтобы передавать в конструктор null.
                Dog dog = new Dog(id,name, age, weight);
                db.addDog(dog);

            }else if(choice.equals("2")){

                ArrayList dogs = db.getAllDogs();

                for (Object d: dogs) {
                    System.out.println(d);
                }

            }else if (choice.equals("3")){

                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert age: ");
                int age = in.nextInt();
                System.out.println("Insert weight: ");
                double weight = in.nextDouble();
                System.out.println("Insert ID");
                int id = in.nextInt();

                Dog dog = new Dog();
                db.updateDog(dog);

            }else if(choice.equals("0")){
                System.exit(0);
            }
        }
    }

}
