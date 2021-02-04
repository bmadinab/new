package com.company.module_2.lesson_6.task_1;

public class Main {
    public static void main(String[] args){
        String operationName = "Add Client to Bank";
        int operationTime = 1;

        Operation operation = new Operation (operationName,operationTime);

        operation.start();

    }
}
