package com.example.spe_mini.Services.Impl;

import com.example.spe_mini.Models.Activity1;
import com.example.spe_mini.Models.Activity3;
import com.example.spe_mini.Repo.Activity1Repo;
import com.example.spe_mini.Repo.Activity3Repo;
import com.example.spe_mini.Services.Activity3Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Activity3ServicesImplementation implements Activity3Services {
    @Autowired
    public Activity3Repo activity3Repo;
    @Override
    public Activity3 addActivity(Activity3 activity3) {
        Activity3 activity31=this.activity3Repo.save(activity3);
        return activity31;
    }
}
