package com.company.module_2.lesson_8.task_2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler extends Thread {

    Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            Scanner in = new Scanner(System.in);

            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            while (true){
                System.out.println(inputStream.readObject());
                outputStream.writeObject(in.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}