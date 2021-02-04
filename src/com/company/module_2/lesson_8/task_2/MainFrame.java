package com.company.module_2.lesson_8.task_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MainFrame extends JFrame {
    Scanner in = new Scanner(System.in);
    public MainFrame() {
        setTitle("New window");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        JButton button;
        JLabel lable1;
        JLabel label2;
        JTextField textField1;
        JTextField textField2;


        lable1 = new JLabel("IP");
        lable1.setSize(300,30);
        lable1.setLocation(100,100);
        add(lable1);

        textField1 = new JTextField();
        textField1.setSize(300,30);
        textField1.setLocation(100,150);
        add(textField1);

        label2 = new JLabel("Port");
        label2.setSize(300,30);
        label2.setLocation(100,200);
        add(label2);

        textField2 = new JTextField();
        textField2.setSize(300,30);
        textField2.setLocation(100,250);
        add(textField2);

        button = new JButton("Confirm");
        button.setSize(300, 30);
        button.setLocation(100, 300);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                    Socket socket = new Socket();

                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());



                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

    }
}

