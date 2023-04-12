package com.example.spe_mini.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int e_id;

    private String name;
    private String mobilenumber;
    @Column(unique = true)
    private String email;
    private String address;
    private String password;
    private String roles;
    private String photo;
    private String qualification;
    private Date joinDate;
    private String Department;
}
