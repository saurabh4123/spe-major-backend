package com.example.spe_mini.Services;

import com.example.spe_mini.Models.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(Integer id);
    Employee createEmployee(Employee employee);

    Employee assignActivity1(Integer eid, Integer aId);

    Employee assignActivity2(Integer eid, Integer aId);

    Employee assignActivity3(Integer eid, Integer aId);

    Employee assignActivity4(Integer eid, Integer aId);

    Employee assignActivity5(Integer eid, Integer aId);
}
