package com.company.module_1.Lesson_11_1;

public class Taxi extends Transport implements Moveable{
    boolean taxi_driver;

    public Taxi() {
    }

    public Taxi(double weight, String date_of_issue, String material, int passengers, boolean service, boolean taxi_driver) {
        super(weight, date_of_issue, material, passengers, service);
        this.taxi_driver = taxi_driver;
    }

    @Override
    public void move() {
       if (taxi_driver) {
           System.out.println("is moving by taxi_driver");
       }
    }
}
