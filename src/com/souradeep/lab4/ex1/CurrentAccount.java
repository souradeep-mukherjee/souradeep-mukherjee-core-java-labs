package com.souradeep.lab4.ex1;

public class CurrentAccount extends Account {

    private double overdraftLimit = 1000;

    public CurrentAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}