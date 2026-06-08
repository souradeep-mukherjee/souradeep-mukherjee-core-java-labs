package com.souradeep.lab1.ex6;

import java.util.Scanner;

public class CalculateDifference {

    public int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        int squareOfSum = sum * sum;

        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        CalculateDifference obj = new CalculateDifference();

        System.out.println("Difference = " + obj.calculateDifference(n));

        sc.close();
    }
}