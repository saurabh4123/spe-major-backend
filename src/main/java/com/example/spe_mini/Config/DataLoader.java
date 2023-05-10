package com.example.spe_mini.Config;


import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class DataLoader  implements ApplicationRunner {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public void run(ApplicationArguments args) {

        String pass= passwordEncoder.encode("admin");
        try {
            List<Employee> employee = employeeRepo.findEmployeeByRoles("Admin");
            Date date=new Date(123,4,10);
            if(employee.size()==0) employeeRepo.save(new Employee("admin", "1234567890" , "admin@gmail.com", "IIIT B",pass , "Admin", "Mtech", date ,"CSE"));
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
