package com.example.spe_mini.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Activity5 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int a5_id;
    private String studentName;
    private String Class;
    private Date date;
    private String achievement;
    private String remark;
    @ManyToMany(mappedBy = "activity5s", cascade = { CascadeType.ALL })
    @JsonBackReference
    private Set<Employee> employees = new HashSet<Employee>();

}
