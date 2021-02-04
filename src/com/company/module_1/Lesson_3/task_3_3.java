package com.company.module_1.Lesson_3;
import java.util.Scanner;
public class task_3_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.println("Insert n");
        int n = in.nextInt();
        int[] table = new int[n];

        for (int i = 0; i < n; i++) {
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
        System.out.println("max" + max);
        System.out.println("min" + min);
    }
}