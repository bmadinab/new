package com.company.module_2.lesson_6.task_2;

import java.io.Serializable;

public class Car extends Thread implements Serializable {
    String name;
    int speed;
    double distance;

    public Car() {
    }

    public Car(String name, int speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void run() {

        try {
            System.out.println(getDistance());
            for (int i = 0; i < 10; i++) {
                double racetime = distance/speed;
                double time1 = racetime;
                double time2 = 0;
                double time3 = 0;

                if (racetime< time1){
                    time2 = racetime;

                }
                else if (time1>time2 && time1>racetime && time2>racetime){
                    time3 = racetime;
                }

                System.out.println("Place 1: " + name + " - " + time1 + " seconds");
                Thread.sleep(500);
                System.out.println("Place 1: " + name + " - " + time2 + " seconds");
                Thread.sleep(500);
                System.out.println("Place 1: " + name + " - " + time3 + " seconds");
                Thread.sleep(500);

            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public String addCar (){
        return name + speed;
    }

    public String getCarInfo (){
        return name + speed + distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", distance=" + distance +
                '}';
    }
}
