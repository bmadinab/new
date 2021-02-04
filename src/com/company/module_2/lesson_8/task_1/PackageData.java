package com.company.module_2.lesson_8.task_1;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    String operationType;
    ArrayList<Book> books;
    Book book;

    public PackageData() {
    }

    public PackageData(String operationType, Book book) {
        this.operationType = operationType;
        this.book = book;
    }

    @Override
    public String toString() {
        return "PackageData{" +
                "operationType='" + operationType + '\'' +
                ", book=" + book +
                '}';
    }
}
