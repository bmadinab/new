package com.company.module_1.Project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        BankAccount [] allAccounts = Database.allAccounts;

        System.out.println("Insert acc number");
        String acc = in.next();

        System.out.println("Insert Pin-code");
        String pin = in.next();

        BankAccount bankAccount = null;

        for(int i = 0; i < allAccounts.length; i++){
            if (allAccounts [i].getAccountNumber().equals(acc)){
                if (allAccounts [i].getPinCode().equals(pin)){
                    bankAccount = allAccounts[i];
                    break;
                }
            }
        }

        while (true){

            if (bankAccount instanceof  CityBankAccount){
                System.out.println("PRESS [1] TO CASH WITHDRAWAL"); // снять деньги
                System.out.println("PRESS [2] TO VIEW BALANCE"); // просмотр баланса
                System.out.println("PRESS [3] TO CHANGE PIN CODE"); // изменить пин код
                System.out.println("PRESS [4] TO CASH IN ACCOUNT"); // добавить деньги в счет
                System.out.println("PRESS [5] TO VIEW ACCOUNT DATA"); // просмотр данные счета
                System.out.println("PRESS [6] TO EXIT"); // выход

                int choice = in.nextInt();
                if (choice == 1){
                    System.out.println("Insert amount to withdraw");
                    int x = in.nextInt();
                    System.out.println(bankAccount.creditBalance(x));
                }
                else if (choice == 2){
                    System.out.println(bankAccount.totalBalance());
                }
                else if (choice == 3){
                    System.out.println("insert old Pin-code");
                    String oldPinCode = in.next();
                    if(bankAccount.getPinCode().equals(oldPinCode)){
                        System.out.println("insert new Pin-code");
                        String newPinCode  = in.next();
                        System.out.println(bankAccount.setPinCode(newPinCode));
                    }
                }
                else if (choice == 4){
                    System.out.println("Insert amount to cash in");
                    int x = in.nextInt();
                    System.out.println(bankAccount.debetBalance(x));
                }
                else if (choice == 5) {
                    System.out.println(bankAccount.accountData());
                }
                else {
                    break;
                }
            }
            else if (bankAccount instanceof NationalBankAccount){
                System.out.println("PRESS [1] TO CASH WITHDRAWAL"); // снять деньги
                System.out.println("PRESS [2] TO VIEW BALANCE"); // просмотр баланса
                System.out.println("PRESS [3] TO EXIT"); // выход

                int choice2 = in.nextInt();
                if (choice2 == 1){
                    System.out.println("insert amount");
                    int x = in.nextInt();
                    System.out.println(bankAccount.creditBalance(x)-200);
                }
                else if (choice2 == 2){
                    System.out.println(bankAccount.totalBalance());
                }
                else{
                    break;
                }

            }
        }

    }
}



