package com.souradeep.lab9.lambda.ex4;

interface EmployeeFactory {
    Employee create();
}

class Employee {

    private int id;
    private String name;

    public Employee() {
        System.out.println("Employee Object Created");
    }
}

public class MethodReferenceDemo {

    public static void main(String[] args) {

        EmployeeFactory factory = Employee::new;

        factory.create();
    }
}