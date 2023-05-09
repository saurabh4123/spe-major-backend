package com.example.spe_mini.Repo;

import com.example.spe_mini.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findByEmailAndPassword(String email,String password);

    Optional<Employee> findByEmail(String email);
}
