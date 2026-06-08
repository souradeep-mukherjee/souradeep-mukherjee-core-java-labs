package com.souradeep.lab1.ex4;

import java.util.Scanner;

/**
 * Prints all prime numbers up to a given integer.
 */
public class PrimeNumbers {

    public static void printPrimes(int n) {
    for (int i = 2; i <= n; i++) {
        boolean isPrime = true;

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.print(i + " ");
        }
    }
    System.out.println(); // Move cursor to next line
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        printPrimes(n);

        sc.close();
    }
}