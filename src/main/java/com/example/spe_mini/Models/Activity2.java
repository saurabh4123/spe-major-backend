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
public class Activity2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int a2_id;
    private String author;
    private String title;
    private Date date;
    private String remark;
    private String publication;
    @ManyToMany(mappedBy = "activity2s", cascade = { CascadeType.ALL })
    private Set<Employee> employees = new HashSet<Employee>();
}
