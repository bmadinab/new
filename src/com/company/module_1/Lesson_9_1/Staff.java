package com.company.module_1.Lesson_9_1;

public class Staff extends User{
    private double salary;
    private String [] subjects = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    @Override
    public String getData() {
        return super.getData();
    }

    public void addSubject(String subject){
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }
}
