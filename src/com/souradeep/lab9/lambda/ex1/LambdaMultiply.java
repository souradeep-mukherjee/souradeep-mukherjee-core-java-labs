package com.souradeep.lab9.lambda.ex1;

interface Multiplication {
    int multiply(int x, int y);
}

public class LambdaMultiply {

    public static void main(String[] args) {

        Multiplication m = (x, y) -> x * y;

        System.out.println(m.multiply(10, 20));
    }
}