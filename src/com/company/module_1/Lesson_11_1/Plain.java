package com.company.module_1.Lesson_11_1;

public class Plain extends Transport implements Moveable {
    boolean pilot;

    public Plain(double weight, String date_of_issue, String material, int passengers, boolean pilot) {
    }

    public Plain(double weight, String date_of_issue, String material, int passengers, boolean service, boolean pilot) {
        super(weight, date_of_issue, material, passengers, service);
        this.pilot = pilot;
    }

    @Override
    public void move() {
        if (pilot){
            System.out.println("is moving by pilot");
        }
    }
}
