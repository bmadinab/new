package com.company.module_2.lesson_4.task_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList <User> users = getUsersList();

        while (true){

            System.out.println("PRESS [1] TO ADD USERS");
            System.out.println ("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO DELETE USERS");
            System.out.println("PRESS [4] TO EXIT");

            int choice = in.nextInt();

            if (choice == 1){
                int id = in.nextInt();
                String login = in.next();
                String password = in.next();
                users.add(new User(id,login,password));
                saveUsersList(users);
            }
            else if (choice == 2){
                System.out.println(users);
            }
            else if (choice == 3){
                System.out.println("insert user index");
                int i = in.nextInt();
                System.out.println(users.remove(i) + "deleted");
            }
            else {
                break;
            }
        }

    }
    public static ArrayList<User> getUsersList(){
        ArrayList<User> users = new ArrayList<>();
        try {
            BufferedReader reader= new BufferedReader(new FileReader("src/com/company/module_2/memo.txt"));
            String id;
            String login;
            String password;
            while ((id = reader.readLine()) != null){
                int idInt = Integer.parseInt(id);
                login = reader.readLine();
                password = reader.readLine();
                users.add(new User(idInt,login,password));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }

    static void saveUsersList(ArrayList<User> users){

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/com/company/module_2/memo.txt"));
            for (User u:users){
                writer.write(u.id);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
