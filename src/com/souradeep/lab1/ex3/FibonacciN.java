package com.souradeep.lab1.ex3;

import java.util.Scanner;

public class FibonacciN {

    // Recursive method
    public static int fibonacciRecursive(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive method
    public static int fibonacciNonRecursive(int n) {
        if (n <= 2) {
            return 1;
        }

        int first = 1;
        int second = 1;
        int fib = 0;

        for (int i = 3; i <= n; i++) {
            fib = first + second;
            first = second;
            second = fib;
        }

        return fib;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Nth Fibonacci Number (Recursive): "
                + fibonacciRecursive(n));

        System.out.println("Nth Fibonacci Number (Non-Recursive): "
                + fibonacciNonRecursive(n));

        sc.close();
    }
}