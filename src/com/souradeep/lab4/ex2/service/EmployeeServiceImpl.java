package com.souradeep.lab4.ex2.service;

import com.souradeep.lab4.ex2.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void findInsuranceScheme(Employee employee) {

        double salary = employee.getSalary();
        String designation = employee.getDesignation();

        if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            employee.setInsuranceScheme("Scheme A");
        } else if (salary >= 20000 && salary < 40000
                && designation.equalsIgnoreCase("Programmer")) {
            employee.setInsuranceScheme("Scheme B");
        } else if (salary > 5000 && salary < 20000
                && designation.equalsIgnoreCase("System Associate")) {
            employee.setInsuranceScheme("Scheme C");
        } else {
            employee.setInsuranceScheme("No Scheme");
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {

        System.out.println("\nEmployee Details");
        System.out.println("-------------------------");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Insurance Scheme: " + employee.getInsuranceScheme());
    }
}