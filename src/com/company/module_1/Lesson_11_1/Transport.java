package com.company.module_1.Lesson_11_1;

public class Transport extends Subject implements Moveable{
    int passengers;
    boolean service;

    public Transport() {
    }

    public Transport(double weight, String date_of_issue, String material, int passengers, boolean service) {
        super(weight, date_of_issue, material);
        this.passengers = passengers;
        this.service = service;
    }

    @Override
    public void move() {

    }
}
