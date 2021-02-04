package com.company.module_1.Lesson_11_1;

public class Train extends Transport implements Moveable{
    boolean train_driver;

    public Train() {
    }

    public Train(double weight, String date_of_issue, String material, int passengers, boolean service, boolean train_driver) {
        super(weight, date_of_issue, material, passengers, service);
        this.train_driver = train_driver;
    }

    @Override
    public void move() {
        if (train_driver){
            System.out.println("is moving by driver");
        }
    }
}
