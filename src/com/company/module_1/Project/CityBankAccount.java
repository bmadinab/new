package com.company.module_1.Project;

public class CityBankAccount implements BankAccount{
    String name;
    String surname;
    int balance;
    String accountNumber;
    String pinCode;

    public CityBankAccount() {
    }

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    @Override
    public String setPinCode(String newPinCode) {
        this.pinCode = pinCode;
        return newPinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public int creditBalance(int credit) {
        if (credit>balance){
            System.out.println("");
        }else {
            balance -= credit;
        }

        return credit;
    }

    @Override
    public int debetBalance(int debet) {
        balance += debet;

        return debet;
    }

    @Override
    public String accountData() {
        return name + ", " + surname + ", " + balance + ", " + accountNumber + ", " + pinCode;
    }


}
