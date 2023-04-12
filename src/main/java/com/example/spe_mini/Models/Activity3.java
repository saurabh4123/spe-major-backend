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
}
