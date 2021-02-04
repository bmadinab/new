package com.company.module_2.lesson_6.task_1;

public class Operation extends Thread{
    String operationName;
    int operationTime;

    public Operation() {
    }

    public Operation(String operationName, int operationTime) {
        this.operationName = operationName;
        this.operationTime = operationTime;
    }

    @Override
    public void run() {

        try {
            System.out.println("Add Client to Bank started");
            for (int i = 0; i < 10; i++) {

                System.out.println("Operation " + operationName + ":" + operationTime + " seconds");
                operationTime ++;
                Thread.sleep(500);

            }
            System.out.println("Add Client to Bank finished");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
