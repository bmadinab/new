package com.company.module_1.Lesson_9;

public class Staff extends User{
    private double salary;
    private String [] subjects = new String[100];
    private int indexOfSubject = 0;

    public Staff() {

    }

    public Staff (int id,String login, String password, String name, String surname, double salary){
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getData() {

        return id + ", " + login + ", " + password + ", " + name + ", " + surname + ", " + salary;
    }

    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;

    }
}
