package com.company.module_1.Lesson_11_1;

public class Animal implements Moveable{
    String name;
    double weight;
    int age;
    int speed;
    String colour;

    public Animal() {
    }

    public Animal(String name,double weight, int age, int speed, String colour) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.speed = speed;
        this.colour = colour;
    }


    @Override
    public void move() {

    }
}
