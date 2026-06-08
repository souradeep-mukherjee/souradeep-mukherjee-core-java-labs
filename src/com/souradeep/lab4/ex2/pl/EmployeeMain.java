package com.souradeep.lab4.ex2.pl;

import java.util.Scanner;

import com.souradeep.lab4.ex2.bean.Employee;
import com.souradeep.lab4.ex2.service.EmployeeServiceImpl;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter Employee ID: ");
        employee.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        employee.setName(sc.nextLine());

        System.out.print("Enter Salary: ");
        employee.setSalary(sc.nextDouble());
        sc.nextLine();

        System.out.print("Enter Designation: ");
        employee.setDesignation(sc.nextLine());

        EmployeeServiceImpl service = new EmployeeServiceImpl();

        service.findInsuranceScheme(employee);
        service.displayEmployeeDetails(employee);

        sc.close();
    }
}