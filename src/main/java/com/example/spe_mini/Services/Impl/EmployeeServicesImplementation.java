package com.example.spe_mini.Services.Impl;
import com.example.spe_mini.Models.*;
import com.example.spe_mini.Repo.*;
import com.example.spe_mini.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

@Service
public class EmployeeServicesImplementation implements EmployeeServices {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private Activity1Repo activity1Repo;
    @Autowired
    private PasswordEncoder passwordEncoder;

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
        List<Employee> ls=this.employeeRepo.findAll();
        List<Employee> ret = new ArrayList<>();
        for(Employee e:ls)
        {
            if(e.getRoles().equals("Teacher"))
                ret.add(e);
        }
        return ret;
    }

    @Override
    public Employee getEmployeeByID(Integer id) {
        Employee employee=this.employeeRepo.findById(id).orElseThrow();
        return employee;
    }

    @Override
    public Employee createEmployee(Employee employee)
    {
        employee.setPassword(passwordEncoder.encode(employee.getPassword()));
        Employee employee1=this.employeeRepo.save(employee);
        return employee1;
    }

    @Override
    public List<Activity1> getActivity1s(Employee employee, int month, int year) {
        List<Activity1> activity1s = employee.getActivity1s();
        List<Activity1> tempActivity1s = new ArrayList<Activity1>();
        for(Activity1 activity1:activity1s) {
            Calendar cal=Calendar.getInstance();
            cal.setTime(activity1.getDate());
            if(cal.get(Calendar.MONTH)==month-1 && cal.get(Calendar.YEAR)==year) {
                tempActivity1s.add(activity1);
//                System.out.println("vnvnvj");
            }
        }
        return tempActivity1s;
    }

    @Override
    public List<Activity2> getActivity2s(Employee employee, int month, int year) {
        List<Activity2> activity2s = employee.getActivity2s();
        List<Activity2> tempActivity2s = new ArrayList<Activity2>();
        for(Activity2 activity2:activity2s) {
            Calendar cal=Calendar.getInstance();
            cal.setTime(activity2.getDate());
            if(cal.get(Calendar.MONTH)==month-1 && cal.get(Calendar.YEAR)==year) {
                tempActivity2s.add(activity2);
            }
        }
        return tempActivity2s;
    }

    @Override
    public List<Activity3> getActivity3s(Employee employee, int month, int year) {
        List<Activity3> activity3s = employee.getActivity3s();
        List<Activity3> tempActivity3s = new ArrayList<Activity3>();
        for(Activity3 activity3:activity3s) {
            Calendar cal=Calendar.getInstance();
            cal.setTime(activity3.getDate());
            if(cal.get(Calendar.MONTH)==month-1 && cal.get(Calendar.YEAR)==year) {
                tempActivity3s.add(activity3);
            }
        }
        return tempActivity3s;
    }

    @Override
    public List<Activity4> getActivity4s(Employee employee, int month, int year) {
        List<Activity4> activity4s = employee.getActivity4s();
        List<Activity4> tempActivity4s = new ArrayList<Activity4>();
        for(Activity4 activity4:activity4s) {
            Calendar cal=Calendar.getInstance();
            cal.setTime(activity4.getDate());
            if(cal.get(Calendar.MONTH)==month-1 && cal.get(Calendar.YEAR)==year) {
                tempActivity4s.add(activity4);
            }
        }
        return tempActivity4s;
    }

    @Override
    public List<Activity5> getActivity5s(Employee employee, int month, int year) {
        List<Activity5> activity5s = employee.getActivity5s();
        List<Activity5> tempActivity5s = new ArrayList<Activity5>();
        for(Activity5 activity5:activity5s) {
            Calendar cal=Calendar.getInstance();
            cal.setTime(activity5.getDate());
            if(cal.get(Calendar.MONTH)==month-1 && cal.get(Calendar.YEAR)==year) {
                tempActivity5s.add(activity5);
            }
        }
        return tempActivity5s;
    }

//    @Override
//    public LoginResponse login(AuthRequest request) {
//        Employee emp=this.employeeRepo.findByEmailAndPassword(request.getEmail(), request.getPassword());
//        if(emp == null)
//            throw new RuntimeException("Did not find patient with these credentials");
//        LoginResponse response=new LoginResponse();
//        response.setName(emp.getName());
//        response.setRoles(emp.getRoles());
//        response.setE_id(emp.getE_id());
//        response.setEmail(emp.getEmail());
//        return response;
//    }
}
