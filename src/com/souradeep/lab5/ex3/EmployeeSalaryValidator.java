package com.souradeep.lab5.ex3;

import java.util.Scanner;

public class EmployeeSalaryValidator {

    static class EmployeeException extends Exception {
        public EmployeeException(String message) {
            super(message);
        }
    }

    public static void validateSalary(double salary)
            throws EmployeeException {

        if (salary < 3000) {
            throw new EmployeeException(
                    "Employee salary should not be below 3000.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        try {
            validateSalary(salary);
            System.out.println("Salary is valid.");
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}