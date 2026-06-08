package com.souradeep.lab7.service;

import com.souradeep.lab7.bean.Employee;

public interface EmployeeService {

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    void displayByScheme(String scheme);

    void displayAllEmployees();

    String getInsuranceScheme(double salary, String designation);
}