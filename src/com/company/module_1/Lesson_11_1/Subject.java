package com.company.module_1.Lesson_11_1;

public class Subject implements Moveable {
    Double weight;
    String date_of_issue;
    String material;

    public Subject() {
    }

    public Subject(Double weight, String date_of_issue, String material) {
        this.weight = weight;
        this.date_of_issue = date_of_issue;
        this.material = material;
    }

    @Override
    public void move() {

    }
}
