package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity1;
import com.example.spe_mini.Models.Activity2;
import com.example.spe_mini.Repo.Activity1Repo;
import com.example.spe_mini.Repo.Activity2Repo;
import com.example.spe_mini.Services.Activity2Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Activity2ServicesImplementation implements Activity2Services {
    @Autowired
    public Activity2Repo activity2Repo;
    @Override
    public Activity2 addActivity(Activity2 activity2) {
        Activity2 activity21=this.activity2Repo.save(activity2);
        return activity21;
    }
}
