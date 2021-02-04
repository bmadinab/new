package com.company.module_1.Project;

public interface BankAccount {

    public String getAccountNumber(); // Данный метод возвращает номер счета

    public String getPinCode(); // Данный метод возвращает пин код карточки

    public String setPinCode(String pinCode); // Данный метод меняет пин код карточки

    public int totalBalance(); // Данный метод возвращает текущий баланс

    public int creditBalance(int credit); // Данный метод мы используем при снятии денег со счета

    public int debetBalance(int debet); // Данный метод мы используем при добавлении денег к счету

    public String accountData(); // Данный метод возвращает данные о клиенте

}
