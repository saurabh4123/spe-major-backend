package com.example.spe_mini.Services;

import com.example.spe_mini.Models.*;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(Integer id);
    Employee createEmployee(Employee employee);
    List<Activity1> getActivity1s(Employee employee, int month, int year);
    List<Activity2> getActivity2s(Employee employee, int month, int year);
    List<Activity3> getActivity3s(Employee employee, int month, int year);
    List<Activity4> getActivity4s(Employee employee, int month, int year);
    List<Activity5> getActivity5s(Employee employee, int month, int year);

//    LoginResponse login(AuthRequest request);
}
