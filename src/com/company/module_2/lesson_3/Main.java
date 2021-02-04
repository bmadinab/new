package com.company.module_2.lesson_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Player> players = new ArrayList<>();

        while (true) {
            System.out.println("[1] insert player");
            System.out.println("[2] avg price");
            System.out.println("[3] sum ages");

            int choice = in.nextInt();

            if (choice == 1){
                System.out.println("[1] insert player");
                String name = in.next();
                double price = in.nextDouble();
                int age = in.nextInt();
                Player player = new Player(name,price,age);
                players.add(player);
            }
            else if (choice == 2) {
                System.out.println("[2] avg price");
                for (Player n : players) {
                    System.out.println(n);

                }

            }
            else {
                break;
            }

        }

    }
}
