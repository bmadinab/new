package com.company.module_1.Lesson_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Engine [] engins = new Engine[4];

        int count = 0;

        while (true){
            System.out.println("[1] FerrariEngine");
            System.out.println("[2] RenaultEnigine");
            System.out.println("[3] Stop");

            int choice1 = in.nextInt();

            if (choice1 == 1) {
                double engineVolume = in.nextDouble();
                int cylinderAmount = in.nextInt();
                double engineWeight = in.nextDouble();
                FerrariEngine ferrariEngine = new FerrariEngine(engineVolume, cylinderAmount, engineWeight);
                engins[count] = ferrariEngine;
                count++;
            }
            else if (choice1 == 2) {
                double engineVolume = in.nextDouble();
                int cylinderAmount = in.nextInt();
                double engineWeight = in.nextDouble();
                double extraTurboEnergy = in.nextDouble();
                RenaultEnigine renaultEnigine = new RenaultEnigine(engineVolume, cylinderAmount, engineWeight,extraTurboEnergy);
                engins[count] = renaultEnigine;
                count++;
            }
            else if (choice1 == 3){
                break;
            }
            for (int i = 0; i < count; i++){
                if (engins [i] instanceof FerrariEngine) {
                    System.out.println (engins[i].getMaxSpeed());
                }
                else if (engins[i] instanceof RenaultEnigine){
                    System.out.println(engins[i].getMaxSpeed());
                }

            }

        }

    }
}
