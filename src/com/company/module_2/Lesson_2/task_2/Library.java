package com.company.module_2.Lesson_2.task_2;

public class Library {
    String name;
    String city;
    Book [] books = new Book[20];
    int index = 0;

    public Library() {
    }

    public Library(String name, String city, Book[] books, int index) {
        this.name = name;
        this.city = city;
        this.books = books;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book){
        try{
            if(index < books.length){
                books [index] = book;
            }
        }catch (Exception e){
            System.out.println("The library is full");
            e.printStackTrace();
        }
        index++;

    }

    public String printBooks(){
        for (int i = 0; i < books.length; i++){
            try{
                String book = books[i].getData();
                for (i = 0; i < books.length; i++){
                    book.equals(books[i]);
                }
            }catch (Exception e){
//                e.printStackTrace();
            }
            System.out.println("The book is empty");
        }
        return books [index].getId() + ", " + books [index].getName() + ", " + books [index].getAuthor();
    }

}
