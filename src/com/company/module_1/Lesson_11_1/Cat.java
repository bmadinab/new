package com.company.module_1.Lesson_11_1;

public class Cat extends Animal implements Moveable{
    String area;


    public Cat() {
    }

    public Cat(String name, double weight, int age, int speed, String colour, String area) {
        super(name, weight, age, speed, colour);
        this.area = area;
    }

    @Override
    public void move() {
        System.out.println("always moves independently");
    }
}
