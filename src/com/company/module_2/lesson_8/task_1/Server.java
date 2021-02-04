package com.company.module_2.lesson_8.task_1;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    public static void main(String[] args){

        ArrayList <Book> books = new ArrayList<>();

        try {
            ServerSocket server = new ServerSocket(1111);
            System.out.println("Server is started");

            while (true){
                Socket socket = server.accept();
                System.out.println("Client is connected");

                ClientHandler handler = new ClientHandler(socket,books);
                handler.start();
                System.out.println("New thread for new client is started");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
