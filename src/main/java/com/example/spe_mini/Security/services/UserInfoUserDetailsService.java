package com.example.spe_mini.Security.services;


import com.example.spe_mini.Models.Employee;
import com.example.spe_mini.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {
    @Autowired
    private EmployeeRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) {
            Optional<Employee> userInfo = repo.findByEmail(username);
//            System.out.println("HELLO               ");
            return userInfo.map(EmployeeToUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("User Not Found!!" + username));
    }
}
