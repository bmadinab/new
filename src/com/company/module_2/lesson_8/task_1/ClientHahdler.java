package com.company.module_2.lesson_8.task_1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

class ClientHandler extends Thread {

    Socket socket;
    ArrayList <Book> books;

    public ClientHandler(Socket socket, ArrayList <Book> books) {
        this.socket = socket;
        this.books = books;
    }

    @Override
    public void run() {

        try {
            Scanner in = new Scanner(System.in);

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            while (true){

                PackageData packageData = (PackageData) inputStream.readObject();
                if (packageData.operationType.equals("List books")){
                    packageData.books = books;
                    outputStream.writeObject(packageData);
                }
                else if (packageData.operationType.equals("Add book")){
                    books.add(packageData.book);
                    packageData.books = books;
                    outputStream.writeObject(packageData);
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
