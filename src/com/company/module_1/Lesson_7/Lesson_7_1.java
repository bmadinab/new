package com.company.module_1.Lesson_7;

import java.util.Scanner;

public class Lesson_7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        System.out.println( maxDigit(a,b,c));

    }

    public static int maxDigit(int a, int b, int c) {
        int x = 0;
        if (a > b && a > c) {
            x = a;
        } else if (b > a && b > c) {
            x = b;
        } else if (c > a && c > b) {
            x = c;
        }
        return x;
    }

}
