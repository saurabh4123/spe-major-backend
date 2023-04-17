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

    @Override
    public Employee assignActivity1(Integer eid, Integer aId) {
        Employee emp=this.employeeRepo.findById(eid).orElseThrow();
        Activity1 activity1=this.activity1Repo.findById(aId).orElseThrow();
        Set<Activity1> list=emp.getActivity1s();
        list.add(activity1);
        emp.setActivity1s(list);
        this.employeeRepo.save(emp);
        return emp;
    }

    @Override
    public Employee assignActivity2(Integer eid,Integer aId) {
        Employee emp=this.employeeRepo.findById(eid).orElseThrow();
        Activity2 activity2=this.activity2Repo.findById(aId).orElseThrow();
        Set<Activity2> list=emp.getActivity2s();
        list.add(activity2);
        emp.setActivity2s(list);
        this.employeeRepo.save(emp);
        return emp;
    }

    @Override
    public Employee assignActivity3(Integer eid, Integer aId) {
        Employee emp=this.employeeRepo.findById(eid).orElseThrow();
        Activity3 activity3=this.activity3Repo.findById(aId).orElseThrow();
        Set<Activity3> list=emp.getActivity3s();
        list.add(activity3);
        emp.setActivity3s(list);
        this.employeeRepo.save(emp);
        return emp;
    }

    @Override
    public Employee assignActivity4(Integer eid, Integer aId) {
        Employee emp=this.employeeRepo.findById(eid).orElseThrow();
        Activity4 activity4=this.activity4Repo.findById(aId).orElseThrow();
        Set<Activity4> list=emp.getActivity4s();
        list.add(activity4);
        emp.setActivity4s(list);
        this.employeeRepo.save(emp);
        return emp;
    }

    @Override
    public Employee assignActivity5(Integer eid, Integer aId) {
        Employee emp=this.employeeRepo.findById(eid).orElseThrow();
        Activity5 activity5=this.activity5Repo.findById(aId).orElseThrow();
        Set<Activity5> list=emp.getActivity5s();
        list.add(activity5);
        emp.setActivity5s(list);
        this.employeeRepo.save(emp);
        return emp;
    }
}
