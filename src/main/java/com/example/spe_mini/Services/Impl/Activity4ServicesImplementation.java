package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity1;
import com.example.spe_mini.Models.Activity4;
import com.example.spe_mini.Repo.Activity1Repo;
import com.example.spe_mini.Repo.Activity4Repo;
import com.example.spe_mini.Services.Activity4Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Activity4ServicesImplementation implements Activity4Services {
    @Autowired
    public Activity4Repo activity4Repo;
    @Override
    public Activity4 addActivity(Activity4 activity4) {
        Activity4 activity41=this.activity4Repo.save(activity4);
        return activity41;
    }
}
