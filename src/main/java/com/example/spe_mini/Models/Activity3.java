package com.example.spe_mini.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Activity3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int a3_id;
    private String titleOfResearch;
    private Date date;
    private String nameOfResearchers;
    @ManyToMany(mappedBy = "activity3s", cascade = { CascadeType.ALL })
    private Set<Employee> employees = new HashSet<Employee>();
}
