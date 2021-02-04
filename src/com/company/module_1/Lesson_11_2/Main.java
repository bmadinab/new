package com.company.module_1.Lesson_11_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Workers [] workers = new Workers[10];
        int count = 0;

        while (true){
            System.out.println("PRESS [1] TO INSERT STAFF");
            System.out.println("PRESS [2] TO INSERT HRMANAGER");
            System.out.println("PRESS [3] TO INSERT PROGRAMMERS");
            System.out.println("PRESS [0] TO EXIT"); // выход

            int choice = in.nextInt();
            if (choice == 1) {
                int id = in.nextInt();
                String name = in.next();
                String surname = in.next();
                int salary = in.nextInt();
                Staff staff = new Staff(id,name,surname,salary);
                workers [count] = staff;
                count++;
            }
            else if (choice == 2) {
                int id = in.nextInt();
                String fullName = in.next();
                int salary = in.nextInt();
                HRManagers hrManagers = new HRManagers(id,fullName,salary);
                workers [count] = hrManagers;
                count++;
            }
            else if (choice == 3){
                int id = in.nextInt();
                String nickname = in.next();
                int salary = in.nextInt();
                int bonusSalary = in.nextInt();
                double x = in.nextDouble();
                double KPIValue = x;
                    if ((x>0)&&(x<1)){
                        x = KPIValue;
                    }
                    else {
                        System.out.println("недопустимое значение KPI");
                    }
                Programmers programmers = new Programmers(id,nickname,salary,bonusSalary,x);
                    workers [count] = programmers;
                    count++;
            }
            else {
                break;
            }
            for (int i = 0; i < count; i++){
                workers [i].getWorkerData();
            }


        }
    }
}
