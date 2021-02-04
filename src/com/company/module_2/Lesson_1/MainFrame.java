package com.company.module_2.Lesson_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton button;
    private JLabel lable;
    private JTextField textField;
    private JComboBox agesBox;
    private Integer[] ages = new Integer[10];
    private JTextArea area;


    public MainFrame (){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bitlab App");
        setSize(500,500);
        setLayout(null);

        lable = new JLabel("Name:");
        lable.setSize(300,30);
        lable.setLocation(100,100);
        add(lable);

        textField = new JTextField("");
        textField.setSize(200,30);
        textField.setLocation(200,100);
        add(textField);


        lable = new JLabel("Phone:");
        lable.setSize(300,30);
        lable.setLocation(100,150);
        add(lable);

        textField = new JTextField("");
        textField.setSize(200,30);
        textField.setLocation(200,150);
        add(textField);

        lable = new JLabel("Age:");
        lable.setSize(300,30);
        lable.setLocation(100,200);
        add(lable);

        agesBox = new JComboBox(ages);
        agesBox.setSize(200,30);
        agesBox.setLocation(200,200);
        add(agesBox);

        button = new JButton("Add contact");
        button.setSize(300,30);
        button.setLocation(100,250);
        button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String text = textField.getText();
                 Integer age = (Integer) agesBox.getSelectedItem();
                 if (!text.equals("")) {
                     //Делаем append, потому что мы хотим добавить новые элементы с сохранением старых данных.
                     // А \n нужен, чтобы каждая новая запись шла в новой строке
                     area.append(text + " " + age + "\n");
                     //Очищаем txtField и agesBox, после успешной операции
                     textField.setText("");
                     agesBox.setSelectedIndex(0);
                 }
             }
        });
        add(button);

        area = new JTextArea();
        area.setSize(300,100);
        area.setLocation(100,300);
        add(area);



    }
}
