package com.example.spe_mini.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
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

}
