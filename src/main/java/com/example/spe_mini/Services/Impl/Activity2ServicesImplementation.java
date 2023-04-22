package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity2;
import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.Activity1Repo;
import com.example.spe_mini.Repo.Activity2Repo;
import com.example.spe_mini.Repo.EmployeeRepo;
import com.example.spe_mini.Services.Activity2Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Activity2ServicesImplementation implements Activity2Services {
    @Autowired
    public Activity2Repo activity2Repo;
    @Autowired
    public EmployeeRepo employeeRepo;
    @Override
    public Employee addActivity(Activity2 activity2,Integer id) {
        Employee emp=this.employeeRepo.findById(id).orElseThrow();
        List<Activity2> activity2List=emp.getActivity2s();
        activity2List.add(activity2);
        emp.setActivity2s(activity2List);
        this.activity2Repo.save(activity2);
        this.employeeRepo.save(emp);
        return emp;
    }
}
