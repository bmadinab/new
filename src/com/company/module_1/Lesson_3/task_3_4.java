package com.company.module_1.Lesson_3;

import java.util.Scanner;

    public class task_3_4 {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
//        System.out.println("Insert n");
            int n = in.nextInt();
            int[] table = new int[n];
            int sum = 0;
            int sum1 = 0;
            double avg = 0;


            for (int i = 0; i < table.length; i++) {
//            System.out.println("Insert array num");
                table[i] = in.nextInt();
                System.out.println("[i]" + i);
            }

            int max = table[0];
            int min = table[0];

            for (int i = 0; i < table.length; i++) {
                if (max < table[i]) {
                    max = table[i];
                }
            }
            for (int i = 0; i < table.length; i++) {
                if (min > table[i]) {
                    min = table[i];
                }
            }
                System.out.println("max " + max);
                System.out.println("min " + min);

            for (int i = 0; i < table.length; i++) {
                sum = (sum + table[i]);
                sum1 = sum - (max+min);
                avg = sum1 / (table.length - 2);
            }
                System.out.println("sum " + sum1);
                System.out.println("avg " + avg);

        }
    }


