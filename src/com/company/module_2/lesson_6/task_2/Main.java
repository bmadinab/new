
package com.company.module_2.lesson_6.task_2;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList <Car> cars = new ArrayList<>();


        try {
            while (true) {
                System.out.println("[1] to insert car");
                System.out.println("[2] to show stat");
                int choice = in.nextInt();
                if (choice == 1) {

                    System.out.println("insert car");
                    String name = in.next();
                    int speed = in.nextInt();
                    double distance = 500;
                    Car car = new Car(name, speed, distance);
                    cars.add(car);
                    try {
                        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("src/com/company/module_2/lesson_6/task_2/cars.txt"));
                        outStream.writeObject(cars);
                        outStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                 else if (choice ==2){
                     System.out.println("show stat");
                     Car car = new Car();
                     try{
                         car.start();
                     }catch (Exception e){
                         e.printStackTrace();
                     }
                     System.out.println(cars);


                 }
                else {
                    break;
                }
            }
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
