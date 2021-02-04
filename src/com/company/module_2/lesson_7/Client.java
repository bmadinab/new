package com.company.module_2.lesson_7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("PRESS [1] TO SEND MESSAGE");
        int choice = in.nextInt();
        if (choice ==1) {
            try {
                Socket socket = new Socket("127.0.0.1", 1111);
                ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                while (true) {
                    System.out.println("Insert your name");
                    String userName = in.next();
                    System.out.println("Insert message text:");
                    String messsageText = in.next();
                    Date sentDate = new Date();
                    MessageData messageData = new MessageData (userName, messsageText, sentDate);
                    outStream.writeObject(messageData);
                    if((messageData = (MessageData) inputStream.readObject())!=null){
                        System.out.println(messageData.getMessageText());
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
