package com.example.spe_mini.Services.Impl;
import com.example.spe_mini.Models.Activity5;
import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.Activity5Repo;
import com.example.spe_mini.Repo.EmployeeRepo;
import com.example.spe_mini.Services.Activity5Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Activity5ServicesImplementation implements Activity5Services {
    @Autowired
    public Activity5Repo activity5Repo;
    @Autowired
    public EmployeeRepo employeeRepo;
    @Override
    public Employee addActivity(Activity5 activity5,Integer id) {
        Employee emp=this.employeeRepo.findById(id).orElseThrow();
        List<Activity5> activity5List=emp.getActivity5s();
        activity5List.add(activity5);
        emp.setActivity5s(activity5List);
        this.activity5Repo.save(activity5);
        this.employeeRepo.save(emp);
        return emp;
    }
}
