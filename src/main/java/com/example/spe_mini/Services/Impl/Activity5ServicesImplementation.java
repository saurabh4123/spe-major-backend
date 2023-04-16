package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity1;
import com.example.spe_mini.Models.Activity5;
import com.example.spe_mini.Repo.Activity1Repo;
import com.example.spe_mini.Repo.Activity5Repo;
import com.example.spe_mini.Services.Activity5Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Activity5ServicesImplementation implements Activity5Services {
    @Autowired
    public Activity5Repo activity5Repo;
    @Override
    public Activity5 addActivity(Activity5 activity5) {
        Activity5 activity51=this.activity5Repo.save(activity5);
        return activity51;
    }
}
