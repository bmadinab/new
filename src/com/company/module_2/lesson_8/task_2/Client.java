package com.company.module_2.lesson_8.task_2;

import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        MainFrame frame = new MainFrame();
        frame.setVisible(true);


        Scanner in = new Scanner(System.in);

//        try {
//
//            Socket socket = new Socket("127.0.0.1",2077);
//
//            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
//            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
//
//            while (true){
//                String s = in.nextLine();
//                outputStream.writeObject(s);
//                System.out.println(inputStream.readObject());
//            }
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//

    }
}
