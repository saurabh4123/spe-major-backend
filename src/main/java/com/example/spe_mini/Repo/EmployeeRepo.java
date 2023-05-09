package com.example.spe_mini.Repo;

import com.example.spe_mini.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findByEmailAndPassword(String email,String password);
}
