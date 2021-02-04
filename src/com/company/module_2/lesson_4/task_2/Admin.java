package com.company.module_2.lesson_4.task_2;

import com.company.module_2.lesson_4.task_1.User;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<GoodItem> goodItems = getGoodItemList();

        while (true){


            
        }

        
    }

    private static ArrayList<GoodItem> getGoodItemList() {

        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try {
            BufferedReader reader= new BufferedReader(new FileReader("src/com/company/module_2/lesson_4/task_2/goodItems.txt"));
            String name;
            String price = null;

            while ((name = reader.readLine()) != null){
                name = reader.readLine();
                int priceInt = Integer.parseInt(price);
                goodItems.add(new GoodItem(name,priceInt));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return goodItems;
    }

    public void saveGoodItems(ArrayList<GoodItem> goodItems){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/company/module_2/lesson_4/task_2/goodItems.txt"));
            for (GoodItem u:goodItems){
                writer.write(u.name + ", " + u.price);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
