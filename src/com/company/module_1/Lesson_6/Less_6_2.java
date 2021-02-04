package com.company.module_1.Lesson_6;

import java.util.Scanner;

public class Less_6_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n");
        int n = in.nextInt();
        System.out.println("m");
        int m = in.nextInt();
        int [][]arr = new int [n][m];
        boolean x;


        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr [i][j] = in.nextInt();
            }
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){

                if ((i > j) == (i < j)){
                    x = true;
                }
                else {
                    x = false;
                }
            }
        }
        if (x = true){
            System.out.println( "y");
        }
        else {
            System.out.println("no");
        }
    }
}
