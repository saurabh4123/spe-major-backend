package com.example.spe_mini.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity4 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int a4_id;
    private String name;
    private String achievement;
    private Date date;
    private String remark;
}
