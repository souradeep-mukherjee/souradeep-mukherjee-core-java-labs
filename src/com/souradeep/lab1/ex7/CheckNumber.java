package com.souradeep.lab1.ex7;

import java.util.Scanner;

public class CheckNumber {

    public boolean checkNumber(int number) {
        int previousDigit = 10;

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit > previousDigit) {
                return false;
            }

            previousDigit = currentDigit;
            number /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        CheckNumber obj = new CheckNumber();

        if (obj.checkNumber(number)) {
            System.out.println(number + " is an Increasing Number");
        } else {
            System.out.println(number + " is not an Increasing Number");
        }

        sc.close();
    }
}