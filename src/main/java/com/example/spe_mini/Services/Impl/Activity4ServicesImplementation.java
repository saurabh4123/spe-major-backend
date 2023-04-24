package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity4;
import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.Activity4Repo;
import com.example.spe_mini.Repo.EmployeeRepo;
import com.example.spe_mini.Services.Activity4Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Activity4ServicesImplementation implements Activity4Services {
    @Autowired
    public Activity4Repo activity4Repo;
    @Autowired
    public EmployeeRepo employeeRepo;
    @Override
    public Employee addActivity(Activity4 activity4,Integer id) {
        Employee emp=this.employeeRepo.findById(id).orElseThrow();
        List<Activity4> activity4List=emp.getActivity4s();
        activity4List.add(activity4);
        emp.setActivity4s(activity4List);
        this.activity4Repo.save(activity4);
        this.employeeRepo.save(emp);
        return emp;
    }
}
