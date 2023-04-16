package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity1;
import com.example.spe_mini.Repo.Activity1Repo;
import com.example.spe_mini.Services.Activity1Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Activity1ServicesImplementation implements Activity1Services {

    @Autowired
    public Activity1Repo activity1Repo;
    @Override
    public Activity1 addActivity(Activity1 activity1){
        Activity1 activity11=this.activity1Repo.save(activity1);
        return activity11;
    }
}
