package com.example.spe_mini.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.Date;

@Data
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
}
