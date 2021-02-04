package com.company.module_1.Lesson_11_1;

public class Horse extends Animal implements Moveable{
    String club;
    boolean wild;
    boolean jockey;


    public Horse() {
    }

    public Horse(String name, double weight, int age, int speed, String colour, String club, boolean wild, boolean jockey) {
        super(name, weight, age, speed, colour);
        this.club = club;
        this.wild = wild;
        this.jockey = jockey;
    }

    @Override
    public void move() {
        if (jockey){
            System.out.println("is moving by jokey");
        }
        if (wild) {
            System.out.println("moves independently");
        }

    }
}
