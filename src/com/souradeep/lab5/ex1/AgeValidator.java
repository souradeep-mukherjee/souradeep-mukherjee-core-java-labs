package com.souradeep.lab5.ex1;

import java.util.Scanner;

public class AgeValidator {

    static class AgeException extends Exception {
        public AgeException(String message) {
            super(message);
        }
    }

    public static void validateAge(int age) throws AgeException {
        if (age <= 15) {
            throw new AgeException("Age must be above 15.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}