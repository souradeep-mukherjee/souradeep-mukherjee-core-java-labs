package com.souradeep.lab9.lambda.ex5;

interface Factorial {
    long calculate(int n);
}

public class FactorialDemo {

    public static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Factorial f = FactorialDemo::factorial;

        System.out.println(f.calculate(5));
    }
}