package com.company.module_1.Lesson_6;
import java.util.Scanner;
public class Lesson_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n");
        int n = in.nextInt();
        int m = 2;
        int  [][] arr = new int[2][n];
        boolean x;

        for (int i = 0; i<m; i++) {
            for (int j = 0; j <m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < m;i++) {

            if (arr[0][i] == arr[1][i]) {
                x = true;
            }
            else {
                x = false;
            }
//            System.out.println("n");
        }
        if (x = true){
            System.out.println( "y");
        }
        else {
            System.out.println("no");
        }
    }


}

