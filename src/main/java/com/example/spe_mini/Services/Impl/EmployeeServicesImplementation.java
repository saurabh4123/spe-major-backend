package com.example.spe_mini.Services.Impl;
import com.example.spe_mini.Models.*;
import com.example.spe_mini.Repo.*;
import com.example.spe_mini.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class EmployeeServicesImplementation implements EmployeeServices {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private Activity1Repo activity1Repo;

    @Autowired
    private Activity2Repo activity2Repo;

    @Autowired
    private Activity3Repo activity3Repo;

    @Autowired
    private Activity4Repo activity4Repo;

    @Autowired
    private Activity5Repo activity5Repo;

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeByID(Integer id) {
        Employee employee=this.employeeRepo.findById(id).orElseThrow();
        return employee;
    }

    @Override
    public Employee createEmployee(Employee employee)
    {
        Employee employee1=this.employeeRepo.save(employee);
        return employee1;
    }
}
