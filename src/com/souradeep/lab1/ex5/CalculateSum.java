package com.souradeep.lab1.ex5;

import java.util.Scanner;

public class CalculateSum {

    public int calculateSum(int n) {
        int sum = 0;
        int count = 0;
        int number = 1;

        while (count < n) {
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number;
                count++;
            }
            number++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        CalculateSum obj = new CalculateSum();

        System.out.println("Sum = " + obj.calculateSum(n));

        sc.close();
    }
}