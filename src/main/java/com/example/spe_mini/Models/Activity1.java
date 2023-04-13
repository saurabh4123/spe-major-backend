package com.example.spe_mini.Models;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Activity1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int a1_id;
    private String event;
    private String title;
    private Date date;
    private int noOfParticipants;
    private String remark;
    @ManyToMany(mappedBy = "activity1s", cascade = { CascadeType.ALL })
    private Set<Employee> employees = new HashSet<Employee>();
}
