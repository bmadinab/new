package com.company.module_2.lesson_8.task_1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try {

            Socket socket = new Socket("127.0.0.1",1111);

            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while (true){

                System.out.println("Press 1 to List books");
                System.out.println("Press 2 to Add book");
                int choice = in.nextInt();

                if (choice == 1){
                    PackageData packageData = new PackageData();
                    packageData.operationType = "List books";
                    outputStream.writeObject(packageData);
                    packageData = (PackageData) inputStream.readObject();
                    System.out.println(packageData.books);
                }
                else if (choice == 2){
                    System.out.println("Add book");
                    int id = in.nextInt();
                    String name = in.next();
                    String author = in.next();
                    Book book = new Book(id, name,author);
                    PackageData packageData = new PackageData();
                    packageData.operationType = "Add book";
                    packageData.book = book;
                    outputStream.writeObject(packageData);
                    packageData = (PackageData) inputStream.readObject();
                    System.out.println(packageData.books);
                }
                else {
                    break;
                }
            }

        }catch (Exception e){
        e.printStackTrace();
        }
    }
}



