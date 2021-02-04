package com.company.module_2.lesson_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager{
    //Наш объект connection, который хранит данные по подключению. Вся движуха идет через него. Что-то на подобие Socket.
    private Connection connection;

    public void connect(){
        try{
            //Подтягиваем драйвер, который мы добавили в самом начале урока
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Создаем подключение.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bd?useUnicode=true&serverTimezone=UTC","root", ""
            );
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public ArrayList<Dog> getAllDogs(){
        //Создаем пустой список of dogs. Позже мы его будем заполнять данными из БД
        ArrayList<Dog> dogs = new ArrayList<>();
        try{
            //Готовим наш запрос в базу данных

            PreparedStatement st = connection.prepareStatement("SELECT * FROM dogs");

            //При запуске данного запроса мы в ответ получаем объект класса ResultSet. Стоит сохранить его в переменную rs.
            ResultSet rs = st.executeQuery();

            //По сути, ResultSet - это и есть наша таблица. Через цикл мы пробежимся по каждой строке данной таблицы
            while (rs.next()){
                //Получаем данные по каждой колонке. Конвертируем их в привычные нам переменные
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double weight = rs.getDouble("weight");

                //Добавляем новую dog в список
                dogs.add(new Dog(id,name,age,weight));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return dogs;
    }

    public void addDog(Dog dog){
        try{
            //Готовим наш запрос. В полях VALUES(), оставляем ?, чтобы указать, что туда скоро будут добавлены данные.
            //Это нужно, чтобы мы могли удобно вставить данные объекта dog в наш запрос
            PreparedStatement st = connection.prepareStatement("INSERT INTO dogs(id, name, age, weight) values(NULL,?,?,?)");

            //Вводим dog's данные в эти вопросительные знаки. Сначала указываем номер знака и потом само значение
            st.setString(1,dog.getName());
            st.setInt(2,dog.getAge());
            st.setDouble(3,dog.getWeight());

            //Запускаем запрос на добавление данных
            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateDog(Dog dog){
        try{
            //Готовим наш запрос. В полях VALUES(), оставляем ?, чтобы указать, что туда скоро будут добавлены данные.
            //Это нужно, чтобы мы могли удобно вставить данные объекта car в наш запрос
            PreparedStatement st = connection.prepareStatement("UPDATE dogs set name = ?, age = ?, weight = ? where id = ?");

            //Вводим данные машины в эти вопросительные знаки. Сначала указываем номер знака и потом само значение
            st.setString(1, dog.getName());
            st.setInt(2, dog.getAge());
            st.setDouble(3, dog.getWeight());
            st.setLong(4, dog.getId());

            //Запускаем запрос на обновление данных
            st.executeUpdate();

            st.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

