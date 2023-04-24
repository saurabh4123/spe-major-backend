package com.example.spe_mini.Services;

import com.example.spe_mini.Models.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(Integer id);
    Employee createEmployee(Employee employee);
}
