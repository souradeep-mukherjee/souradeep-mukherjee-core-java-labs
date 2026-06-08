package com.souradeep.lab7.bean;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary,
                    String designation, String insuranceScheme) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = insuranceScheme;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Name=" + name +
                ", Salary=" + salary +
                ", Designation=" + designation +
                ", Insurance Scheme=" + insuranceScheme;
    }
}