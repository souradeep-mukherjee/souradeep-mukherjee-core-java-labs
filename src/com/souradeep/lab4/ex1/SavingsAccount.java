package com.souradeep.lab4.ex1;

public class SavingsAccount extends Account {

    private final double minimumBalance = 500;

    public SavingsAccount(Person accHolder, double balance) {
        super(accHolder, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}