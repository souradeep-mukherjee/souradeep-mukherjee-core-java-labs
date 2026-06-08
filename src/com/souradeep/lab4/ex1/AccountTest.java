package com.souradeep.lab4.ex1;

public class AccountTest {

    public static void main(String[] args) {

        Person smith = new Person("Smith", 30);
        Person kathy = new Person("Kathy", 28);

        SavingsAccount smithAccount = new SavingsAccount(smith, 10000);
        SavingsAccount kathyAccount = new SavingsAccount(kathy, 12000);

        smithAccount.deposit(6000);
        kathyAccount.withdraw(5000);

        System.out.println("Smith Account Balance: " + smithAccount.getBalance());
        System.out.println("Kathy Account Balance: " + kathyAccount.getBalance());
    }
}