package com.company.module_1.Lesson_11_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Animal [] animals = new Animal[10];
        Human [] humans = new Human[3];
        Transport [] transports = new Transport[5];
        int count  = 0;

        while (true) {
            System.out.println("1 for cat");
            System.out.println("2 for horse");
            System.out.println("3 for train");
            System.out.println("4 for plain");
            System.out.println("5 for taxi");
            System.out.println("6 for human");

            int choice = in.nextInt();

            if (choice == 1) {
                String name = in.next();
                double weight = in.nextDouble();
                int age = in.nextInt();
                int speed = in.nextInt();
                String colour = in.next();
                String area = in.next();
                Cat cat = new Cat(name,weight, age, speed, colour, area);
                animals[count] = cat;
                count++;
            }
            else if (choice == 2) {
                String name = in.next();
                double weight = in.nextDouble();
                int age = in.nextInt();
                int speed = in.nextInt();
                String colour = in.next();
                String area = in.next();
                System.out.println("wild?");
                boolean wild = in.nextBoolean();
                System.out.println("has jockey?");
                boolean jockey = in.nextBoolean();
                Horse horse = new Horse(name,weight, age, speed, colour, area, wild, jockey);
                animals[count] = horse;
                count++;
            }
            else if (choice == 3) {
                double weight = in.nextDouble();
                String date_of_issue = in.next();
                String material = in.next();
                int passengers = in.nextInt();
                boolean service = in.nextBoolean();
                boolean train_driver = in.nextBoolean();
                Train train = new Train(weight, date_of_issue, material, passengers, service, train_driver);
                transports[count] = train;
                count++;
            }
            else if (choice == 4) {
                double weight = in.nextDouble();
                String date_of_issue = in.next();
                String material = in.next();
                int passengers = in.nextInt();
                boolean pilot = in.nextBoolean();
                Plain plain= new Plain(weight, date_of_issue, material, passengers, pilot);
                transports[count] = plain;
                count++;
            }
            else if (choice == 5) {
                double weight = in.nextDouble();
                String date_of_issue = in.next();
                String material = in.next();
                int passengers = in.nextInt();
                boolean service = in.nextBoolean();
                boolean taxi_driver = in.nextBoolean();
                Taxi taxi = new Taxi(weight, date_of_issue, material, passengers, service, taxi_driver);
                transports[count] = taxi;
                count++;
            }
            else if (choice == 6) {
                String name = in.next();
                int height = in.nextInt();
                int weight = in.nextInt();
                int age = in.nextInt();
                String gender = in.next();
                String race = in.next();
                String country = in.next();
                System.out.println("paralyzed?");
                boolean paralyzed = in.nextBoolean();
                humans[count] = new Human(name,height, weight, age, gender, race, country,paralyzed);
                count++;
            }
            else {
                break;
            }
            for(int i = 0; i < count; i++) {
                if (animals[i] instanceof Cat){
                    animals[i].move();
                }
                if (animals[i] instanceof Horse){
                    animals [i].move();
                }
                if (transports[i] instanceof Train){
                    transports[i].move();
                }
                if (transports[i] instanceof Plain){
                    transports[i].move();
                }
                if (transports[i] instanceof Taxi){
                    transports[i].move();
                }
                if (humans[i] != null){
                    humans[i].move();
                }
            }

        }


    }
}
