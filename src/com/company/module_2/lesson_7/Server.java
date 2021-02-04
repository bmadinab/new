package com.company.module_2.lesson_7;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket server = new ServerSocket(1111);
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MessageData messageData = null;
            while((messageData = (MessageData) inStream.readObject())!=null){
                System.out.println(messageData);
                MessageData response = null;
                if(messageData.getMessageText().toLowerCase().equals("hello") || messageData.getMessageText().toLowerCase().equals("hi")){
                    response = new MessageData(messageData.userName, response.messageText, messageData.sentDate);
                }
                outputStream.writeObject(response);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
