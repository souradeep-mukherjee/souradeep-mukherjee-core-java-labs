package com.souradeep.lab7.service;

import java.util.HashMap;
import java.util.Map;

import com.souradeep.lab7.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    private HashMap<Integer, Employee> employees = new HashMap<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employees.remove(id);
        System.out.println("Employee deleted successfully.");
    }

    @Override
    public void displayByScheme(String scheme) {

        for (Employee employee : employees.values()) {

            if (employee.getInsuranceScheme()
                    .equalsIgnoreCase(scheme)) {

                System.out.println(employee);
            }
        }
    }

    @Override
    public void displayAllEmployees() {

        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    @Override
    public String getInsuranceScheme(double salary,
                                     String designation) {

        if (salary >= 40000 &&
                designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        }

        if (salary >= 20000 &&
                salary < 40000 &&
                designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        }

        if (salary > 5000 &&
                salary < 20000 &&
                designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        }

        return "No Scheme";
    }
}