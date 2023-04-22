package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity3;
import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.Activity3Repo;
import com.example.spe_mini.Repo.EmployeeRepo;
import com.example.spe_mini.Services.Activity3Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Activity3ServicesImplementation implements Activity3Services {
    @Autowired
    public Activity3Repo activity3Repo;
    @Autowired
    public EmployeeRepo employeeRepo;
    @Override
    public Employee addActivity(Activity3 activity3,Integer id) {
        Employee emp=this.employeeRepo.findById(id).orElseThrow();
        List<Activity3> activity3List=emp.getActivity3s();
        activity3List.add(activity3);
        emp.setActivity3s(activity3List);
        this.activity3Repo.save(activity3);
        this.employeeRepo.save(emp);
        return emp;
    }
}
