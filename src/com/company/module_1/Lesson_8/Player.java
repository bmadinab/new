package com.company.module_1.Lesson_8;

public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player() {
    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public String getData (){
        return number + ", " + name + ", " + surname + ", " + position;
    }
}
