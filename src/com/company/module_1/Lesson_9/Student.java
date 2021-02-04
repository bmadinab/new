package com.company.module_1.Lesson_9;

public class Student extends User{
    double gpa;
    private String [] courses = new String[100];
    private int indexOfCourses = 0;

    public Student() {

    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getData() {
        return id +", " + login +", " + password +", " + name +", " + surname +", " + "gpa " + gpa;
    }


    public void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses ++;

    }
}
