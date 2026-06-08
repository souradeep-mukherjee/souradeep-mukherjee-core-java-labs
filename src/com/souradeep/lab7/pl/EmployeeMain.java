package com.souradeep.lab7.pl;

import java.util.Scanner;

import com.souradeep.lab7.bean.Employee;
import com.souradeep.lab7.service.EmployeeServiceImpl;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeServiceImpl service = new EmployeeServiceImpl();

        while (true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees By Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();

                    String scheme =
                            service.getInsuranceScheme(
                                    salary,
                                    designation);

                    Employee employee =
                            new Employee(
                                    id,
                                    name,
                                    salary,
                                    designation,
                                    scheme);

                    service.addEmployee(employee);

                    System.out.println("Employee Added.");
                    break;

                case 2:

                    System.out.print("Enter Scheme: ");
                    sc.nextLine();
                    String insuranceScheme = sc.nextLine();

                    service.displayByScheme(insuranceScheme);
                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int deleteId = sc.nextInt();

                    service.deleteEmployee(deleteId);
                    break;

                case 4:

                    service.displayAllEmployees();
                    break;

                case 5:

                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}