package com.example.spe_mini.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
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

    @OneToMany(fetch = FetchType.EAGER)
    private List<Activity1> activity1s;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Activity2> activity2s;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Activity3> activity3s;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Activity4> activity4s;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Activity5> activity5s;



}
