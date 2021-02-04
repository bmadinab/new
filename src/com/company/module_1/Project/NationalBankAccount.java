package com.company.module_1.Project;

public class NationalBankAccount implements BankAccount{
    String fullName;
    int balance;
    String accountNumber;
    String pinCode;

    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
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

    public String setPinCode(String pinCode) {
        this.pinCode = pinCode;
        return pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public int creditBalance(int credit) {
        if(credit > balance){
            System.out.println("ne dost sr-v");
        }
        else{
            balance -= credit;
        }
        return credit;
    }

    @Override
    public int debetBalance(int debet) {

        return debet;
    }

    @Override
    public String accountData() {
        return  fullName + ", " + balance + ", " + accountNumber + ", " + pinCode;
    }


}
