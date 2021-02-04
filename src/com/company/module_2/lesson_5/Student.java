package com.company.module_2.lesson_5;

import java.util.ArrayList;
import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String surname;
    ArrayList<Subject> subjects = new ArrayList<Subject>();

    public Student() {
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, int credits) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
