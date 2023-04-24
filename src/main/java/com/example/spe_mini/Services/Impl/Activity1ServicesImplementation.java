package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity1;
import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.Activity1Repo;
import com.example.spe_mini.Repo.EmployeeRepo;
import com.example.spe_mini.Services.Activity1Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Activity1ServicesImplementation implements Activity1Services {

    @Autowired
    public Activity1Repo activity1Repo;
    @Autowired
    public EmployeeRepo employeeRepo;
    @Override
    public Employee addActivity(Activity1 activity1,Integer id){
        Employee emp=this.employeeRepo.findById(id).orElseThrow();
        List<Activity1> activity1List=emp.getActivity1s();
        activity1List.add(activity1);
        emp.setActivity1s(activity1List);
        this.activity1Repo.save(activity1);
        this.employeeRepo.save(emp);
        return emp;
    }

}
