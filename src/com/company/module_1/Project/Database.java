package com.company.module_1.Project;

public class Database {
    public static BankAccount [] allAccounts = new BankAccount[10];

    static{

            allAccounts[0] = new CityBankAccount("Ivan","Petrov",300000,"KZ01032C31334567", "0120");
            allAccounts[1] = new CityBankAccount("Yerbol","Temirov",1000000,"KZ01032C31384639", "0011");
            allAccounts[2] = new NationalBankAccount("Aizhan Zhumanova",390000,"KZ12934N34568295", "2000");
            allAccounts[3] = new CityBankAccount("Saule","Abisheva",45000,"KZ01032C56738295", "2499");
            allAccounts[4] = new CityBankAccount("Erbol","Assanbek",55300,"KZ01032C49305729", "4529");
            allAccounts[5] = new NationalBankAccount("Irina Yung",46932,"KZ01032N56748390", "6438");
            allAccounts[6] = new CityBankAccount("Kaisar","Ardak",2000,"KZ01032C85746392", "3333");
            allAccounts[7] = new CityBankAccount("Michail","Terentyev",52190,"KZ01032C68305629", "0900");
            allAccounts[8] = new NationalBankAccount("Nadezhda Khodzhayeva",4239,"KZ01032N02849365", "6492");
            allAccounts[9] = new NationalBankAccount("Karina Kassenova",73560,"KZ01032N84037244", "6666");

            // Таким образом на ваше усмотрение мы должны заполнить список всех счетов

    }

}
