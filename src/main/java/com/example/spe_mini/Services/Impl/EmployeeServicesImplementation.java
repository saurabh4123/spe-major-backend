package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.EmployeeRepo;
import com.example.spe_mini.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServicesImplementation implements EmployeeServices {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee createEmployee(Employee employee)
    {
        this.employeeRepo.save(employee);
        return employee;
    }
}
