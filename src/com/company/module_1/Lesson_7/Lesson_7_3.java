package com.company.module_1.Lesson_7;

import java.util.Scanner;

public class Lesson_7_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 1;
        int  [][] arr = new int[1][n];
        int x = 0;
//        int count = getAll();

        for (int i = 0; i<m; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
//        System.out.println(count);

    }
    public static int getAll (int[] array){
        int cnt =0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
