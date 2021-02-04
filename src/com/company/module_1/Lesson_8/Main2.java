package com.company.module_1.Lesson_8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Club [] clubs1 = new Club[2];
        Player [] players1 = new Player[3];
//        Player [] players2 = new Player[5];

        int count = 0;
        System.out.println("select club");
        System.out.println("1 for club 1");
        System.out.println("2 for club 2");

        int choice = in.nextInt();

        if(choice ==1){
            System.out.println("Insert club 1");
            String c_name = in.next();
            String c_country = in.next();
            int ratingPoints = in.nextInt();
            Club club1 = new Club(c_name,c_country,ratingPoints,players1);
            players1 = new Player[3];
            for (int i = 0; i < players1.length; i++){
                System.out.println("Insert team 1");
                int number = in.nextInt();
                String name = in.next();
                String surname = in.next();
                String position = in.next();
                players1[count] = new Player(number,name, surname,position);
                count ++;
            }
            System.out.println(club1.printClubData());

        }
//        System.out.println("press 1 to get club data");
//        int choice2 = in.nextInt();
//        if (choice2 == 1) {
//            for (int i = 0; i < clubs1.length; i++) {
//                System.out.println(clubs1[i].printClubData());
//            }
//
//        }

    }
}
