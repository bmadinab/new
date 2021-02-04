package com.company.module_2.Lesson_2.task_1;

public class User {
    String name;
    String surname;
    int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
