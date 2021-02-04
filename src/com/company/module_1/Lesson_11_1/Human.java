package com.company.module_1.Lesson_11_1;

public class Human implements Moveable{
    String name;
    int height;
    int weight;
    int age;
    String gender;
    String race;
    String country;
    boolean paralyzed;

    public Human() {
    }

    public Human(String name, int height, int weight, int age, String gender, String race, String country, boolean paralyzed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.country = country;
        this.paralyzed = paralyzed;
    }

    @Override
    public void move() {
        if (paralyzed){
            System.out.println("can't move without help");
        }
        else{
            System.out.println("moves independently");
        }

    }
}
