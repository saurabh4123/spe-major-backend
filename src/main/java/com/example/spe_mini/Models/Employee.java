package com.example.spe_mini.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
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

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "employees_activity1",joinColumns = {@JoinColumn(name = "e_id")},inverseJoinColumns = {@JoinColumn(name = "a1_id")})
    Set<Activity1> activity1s = new HashSet<Activity1>();
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "employees_activity2",joinColumns = {@JoinColumn(name = "e_id")},inverseJoinColumns = {@JoinColumn(name = "a2_id")})
    Set<Activity2> activity2s = new HashSet<Activity2>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "employees_activity3",joinColumns = {@JoinColumn(name = "e_id")},inverseJoinColumns = {@JoinColumn(name = "a3_id")})
    Set<Activity3> activity3s = new HashSet<Activity3>();
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "employees_activity4",joinColumns = {@JoinColumn(name = "e_id")},inverseJoinColumns = {@JoinColumn(name = "a4_id")})
    Set<Activity4> activity4s = new HashSet<Activity4>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "employees_activity5",joinColumns = {@JoinColumn(name = "e_id")},inverseJoinColumns = {@JoinColumn(name = "a5_id")})
    Set<Activity5> activity5s = new HashSet<Activity5>();



}
