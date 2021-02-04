package com.company.module_1.Lesson_4;

import java.util.Scanner;

public class Lesson_4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.println("Insert n");
        int n = in.nextInt();
        int[] table = new int[n];
        int i = 0;
        int idx = 0;

        for (i = 0; i < table.length; i++) {
            table[i] = in.nextInt();
            idx = i;
            System.out.println("[i] " + idx + "  " + table[i]);
        }
        System.out.println("insert m");
        int m = in.nextInt();
        for (i = 0; i < table.length; i++) {
            if (m == table[i]) {
                System.out.println("yes" + "[Index] " + i);
            } else {
            }
            System.out.println("no");
        }
    }
}

