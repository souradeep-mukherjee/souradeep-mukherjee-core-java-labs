package com.souradeep.lab5.ex2;

import java.util.Scanner;

public class EmployeeNameValidator {

    static class NameException extends Exception {
        public NameException(String message) {
            super(message);
        }
    }

    public static void validateName(String firstName, String lastName)
            throws NameException {

        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new NameException("First Name and Last Name cannot be blank.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        try {
            validateName(firstName, lastName);
            System.out.println("Employee Name: " + firstName + " " + lastName);
        } catch (NameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}