package com.company.module_1.Lesson_7;

import java.util.Scanner;

public class Lesson_7_2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();
        int count = 0;

        System.out.println(countVowel(count, word));

    }

    public static int countVowel(int count, String slovo) {
        char [] vowel = {'a','e','i','o','q','u','y'};
        String word =  "";

        for(int i = 0; i < slovo.length(); i++){
            char w = slovo.charAt(i);
            int[] countVowel = new int[word.length()];
            if (w == 'a'){
                count = i++;
                System.out.println( "test");
            }
            else if (w == 'e'){
                count = i++;
            }
            else if (w == 'i'){
                count = i++;
            }
            else if (w == 'o'){
                count = i++;
            }
            else if (w == 'q'){
                count = i++;
            }
            else if (w == 'u'){
                count = i++;
            }
            else if (w == 'y'){
                count = i++;
            }
            System.out.println("test" + count);
        }
        return count;
    }
}
